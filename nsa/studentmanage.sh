op=1
flag=1

while [ $flag -eq 1 ]
do

	echo -e "1.View DB\n2.Insert\n3.Delete\n4.View Record\n5.Exit"
	read -p "Enter option:" op
	case $op in
	1) 
		cat student.txt
		;;
	2)	
		read -p "Enter the record:" rec
		echo $rec >> student.txt
		;;
	3)	
		read -p "Enter Id of student:" id
		grep -v $id student.txt >> studentcp.txt
		cp studentcp.txt student.txt
		;;
	4)	
		read -p "Enter the search ID:" sid
		grep -i $sid student.txt
		;;
	5)	
		echo "Exiting"
		flag=0
		;;
	*)
		echo "Invalid choice"
		;;
	esac
done

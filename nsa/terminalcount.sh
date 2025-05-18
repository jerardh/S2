if [ $# -eq 1 ]
then
	who > userinfo.txt
	echo $1 " is logged at "
	grep -c $1 userinfo.txt
	echo "times"
else
	echo "Invalid input"
fi


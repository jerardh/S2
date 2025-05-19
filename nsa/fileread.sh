read -p "Enter file name:" name
IFS=
while read line
do
	echo $line
done < $name

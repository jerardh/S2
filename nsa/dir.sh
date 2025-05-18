if [ $# -eq 1 ]
then
	if [ -d $1 ]
	then
		echo $1 " is a directory"
	else
		echo $1 " is not a directory"
	fi
else
	echo "Invalid input"
fi

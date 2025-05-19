read -p "Enter directory path:" path
count=0
for dir in "$path"/*
do
	if [ -d $dir ]
	then
		count=$(( count+1 ))
	fi
done
echo "Total number of sub directories=$count"

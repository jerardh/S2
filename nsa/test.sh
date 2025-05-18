res=()
count=0
while read line
do
	res+=($line)
	count=$(( count+1 ))
done < s1.txt
while [ $count -ge 0 ]
do
	echo "${res[$count]}"
	count=$(( count-1 ))
done

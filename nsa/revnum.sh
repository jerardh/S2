read -p "Enter a number " n
rev=0
while [ $n -gt 0 ]
do
	dg=$(( n%10 ))	
	rev=$(( rev*10+dg ))
	n=$(( n/10 ))

done
echo $rev

read -p "Enter a number:" n
r=$(( n % 2 ))
if [ $r -eq 0 ]
then
	echo "even"
else
	echo "odd"
fi

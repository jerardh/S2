read -p "Enter the string:" str
length=${#str}
res=""
i=$(( length-1 ))
while [ $i -ge 0 ]
do
 res+=${str:$i:1}
 i=$(( i-1 ))
done
echo "Reversed String " $res

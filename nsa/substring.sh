read -p "Enter a string:" str
read -p "Enter start:" start
read -p "Enter length:" len
echo ${str:$start:$len}

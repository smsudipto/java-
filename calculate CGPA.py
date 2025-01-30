num=int(input("Enter your number:"))
print("Number is:",num)
if(num>=80 and num<=100):
    print( "your CGPA is 4.00.")
elif(80>num and num>=70):
    print("your CGPA is 3.50")
elif(70>num and num>=60):
    print("your CGPA is 3.00")
elif(60>num and num>=50):
    print("your CGPA is 2.50")
elif(50>num and num>=40):
    print("your CGPA is 2.00")
else:
    print("you are fail")
    print("Try again .Thank you.")
import pymongo

# Connection
url = "mongodb://localhost:27017"
client = pymongo.MongoClient(url)
db  = client["college"]
collection = db["studlist"]


print("1. Name and Mark of all female students in MCA:\n ")
for student in collection.find({"gender": "female", "course": "MCA"}):
    print("Name:", student['name']['fname'], student['name']['lname'])
    print("Mark:", student['mark'], "\n")


def print_details(student):
    """Function to print all details of a student"""
    print(f"""
Name: {student['name']['fname']} {student['name']['lname']}
Address: {student['address']['house_name'], student['address']['city']}
Gender: {student['gender']}
Course: {student['course']}
Mark: {student['mark']}
Grade: {student['grade']}
Phone: {student['phone']['no']} ({student['phone']['type']})""")


print("2. Student who scored the highest mark in MCA: ")
topper = sorted([student for student in collection.find({"course": "MCA"})], key=lambda x: x["mark"])[-1]
print_details(topper)
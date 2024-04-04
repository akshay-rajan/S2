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
Address: {student['address']['house_name']}, {student['address']['city']}
Gender: {student['gender']}
Course: {student['course']}
Mark: {student['mark']}
Grade: {student['grade']}
Phone: {student['phone']['no']} ({student['phone']['type']})
""")


print("2. Student who scored the highest mark in MCA: ")
topper = collection.find({"course": "MCA"}).sort("mark", -1).limit(1)
print_details(topper[0])


print("3. All male students who secured A+: ")
for student in collection.find({"gender": "male", "grade": "A+"}):
    print_details(student)


print("4. Top 3 Students in Mechanical Department: ")
mech_toppers = collection.find({"course": "Mechanical"}).sort("mark", -1).limit(3)
for student in mech_toppers:
    print_details(student)

print("5. Female Students who have secured more than 90: ")
for student in collection.find({"gender": "female", "mark": {"$gt": 90}}):
    print(f"""
Name: {student['name']['fname']} {student['name']['lname']}
Grade: {student['grade']}
Mark: {student['mark']}
Contact: {student['phone']['no']} ({student['phone']['type']})
""")


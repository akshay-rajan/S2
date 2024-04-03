import pymongo

url = "mongodb://localhost:27017"
client = pymongo.MongoClient(url)
db  = client["college"]
collection = db["studlist"]

print("1. Name and Mark of all female students in MCA: ")
for student in collection.find({"gender": "female", "course": "MCA"}):
    print("Name:", student['name']['fname'], student['name']['lname'])
    print("Mark:", student['mark'])

print("2. Student who scored the highest mark in MCA: ")
highest_score = max(student['mark'] for student in collection.find({'course': 'MCA'}))

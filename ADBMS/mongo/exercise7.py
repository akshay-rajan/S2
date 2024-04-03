import pymongo

url = "mongodb://localhost:27017"
client = pymongo.MongoClient(url)
db  = client["college"]
collection = db["studlist"]
print(collection)
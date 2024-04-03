# MongoDB

MongoDB is a source-available cross-platform document-oriented database program. Classified as a NoSQL database program, MongoDB uses JSON-like documents with optional schemas. MongoDB is developed by MongoDB Inc.

Key Features of MongoDB:

1. **Document-Oriented Storage**: Data is stored in the form of JSON style documents.

2. **Index on any attribute**: You can index any attribute in your document to improve the performance of searches.

3. **Replication & High Availability**: MongoDB provides high availability with replica sets. A replica set consists of two or more copies of the data.

4. **Automatic Sharding**: It allows horizontal scaling, which is hard to achieve in other databases. This is done by sharding data across many servers.

5. **Rich Queries**: MongoDB supports a rich query framework that includes secondary indexes, range queries, sorting, and aggregations.

6. **No SQL**: It means you can store your data without having to worry about its structure.


![diff-rel-doc](./sqlvsnosql.jpg)


## CRUD

CRUD stands for Create, Read, Update, and Delete. These are the four basic operations that can be performed with most traditional database systems and they are also used in MongoDB.

Here's how you can perform CRUD operations in MongoDB:

### Create

In MongoDB, the `db.collection.insert()` method is used to add new documents to a collection.

```javascript
db.collection('collectionName').insertOne({ key: 'value' });
```

### Read

The `db.collection.find()` method is used to retrieve documents from a collection. This method returns a cursor to the results; however, you can easily convert it to an array of documents.

```javascript
db.collection('collectionName').find({ key: 'value' });
```

### Update

The `db.collection.update()` method is used to update documents in a collection. The following example updates the first document where `key` equals `value`.

```javascript
db.collection('collectionName').updateOne({ key: 'value' }, { $set: { key: 'new value' } });
```

### Delete

The `db.collection.remove()` method is used to delete documents from a collection.

```javascript
db.collection('collectionName').deleteOne({ key: 'value' });
```

Remember, MongoDB is schema-less, meaning the documents in a single collection do not need to have the same set of fields and the data type for a field can differ across documents within a collection.

# PyMongo

1. **Installation:**
   ```bash
   pip install pymongo
   ```

2. **Importing PyMongo:**
   ```python
   import pymongo
   ```

3. **Connecting to MongoDB:**
   Use `pymongo.MongoClient` to connect to your MongoDB server. You typically specify the connection string in the following format:
   ```python
   client = pymongo.MongoClient("mongodb://localhost:27017/")
   ```

4. **Accessing Databases and Collections:**
   Once connected, you can access databases and collections within your MongoDB server:
   ```python
   db = client["mydatabase"]  # Access a specific database
   collection = db["mycollection"]  # Access a specific collection within the database
   ```

5. **Inserting Documents:**
   Use `collection.insert_one()` or `collection.insert_many()` to insert documents into a collection:
   ```python
   # Insert a single document
   document = {"name": "John Doe", "age": 30}
   result = collection.insert_one(document)
   
   # Insert multiple documents
   documents = [{"name": "Alice", "age": 25}, {"name": "Bob", "age": 35}]
   result = collection.insert_many(documents)
   ```

6. **Querying Documents:**
   Use `collection.find()` to query documents in a collection. You can specify filter criteria using MongoDB query operators:
   ```python
   # Find documents that match a filter
   query = {"age": {"$gt": 25}}  # Find documents where age is greater than 25
   results = collection.find(query)
   
   # Iterate over the query results
   for doc in results:
       print(doc)
   ```

7. **Updating Documents:**
   Use `collection.update_one()` or `collection.update_many()` to update documents in a collection:
   ```python
   # Update a single document
   filter = {"name": "John Doe"}
   update = {"$set": {"age": 32}}  # Update the age field
   result = collection.update_one(filter, update)
   
   # Update multiple documents
   filter = {"age": {"$lt": 30}}  # Filter documents where age is less than 30
   update = {"$inc": {"age": 1}}  # Increment the age field by 1
   result = collection.update_many(filter, update)
   ```

8. **Deleting Documents:**
   Use `collection.delete_one()` or `collection.delete_many()` to delete documents from a collection:
   ```python
   # Delete a single document
   filter = {"name": "John Doe"}
   result = collection.delete_one(filter)
   
   # Delete multiple documents
   filter = {"age": {"$gte": 40}}  # Delete documents where age is greater than or equal to 40
   result = collection.delete_many(filter)
   ```

9. **Indexes:**
   You can create indexes on fields in your collections for faster query performance. Use `collection.create_index()` to create indexes:
   ```python
   # Create an index on the "name" field
   collection.create_index([("name", pymongo.ASCENDING)])
   ```

10. **Error Handling:**
    Implement error handling to deal with potential exceptions, such as connection errors or database operation failures:
    ```python
    try:
        # MongoDB operations
    except pymongo.errors.ConnectionError as e:
        print("Error connecting to MongoDB:", e)
    except pymongo.errors.OperationFailure as e:
        print("MongoDB operation failed:", e)
    ```

These are the essential concepts and practices you need to know when using PyMongo to interact with MongoDB databases from Python. Familiarizing yourself with these concepts will enable you to work effectively with MongoDB in your Python applications.

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

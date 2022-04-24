# MERKLE-TREE
MERKLE TREE AND IT'S IMPLEMENTATION IN JAVA

Merkle tree is a tree data structure with leaf nodes and non-leaf nodes. It also known as Hash tree. The reason behind it is it only stores the hashes in its nodes instead of data. In its leaf nodes, it will store the hash of the data. Non leaf nodes contain the hash of its children. Merkle tree is used for data verification and data synchronization. Merkle tree makes use of hash functions in order to provide data integrity.

A Merkle tree is a complete binary tree equipped with a function hash and an assignment, Φ, which maps the set of nodes to the set of k-length strings: 
n→ Φ(n) ∈ {0, 1}k. For the two child nodes, nleft and nright, of any interior node, nparent, the assignment Φ is required to satisfy

**Φ(nparent) = hash(Φ(nleft)||Φ(nright))**

The function hash is a one-way function such as SHA-1 hashing algorithm.
Merkle tree can keep a log of any time anyone accesses the records. Every time you add a new log record, the application would create a new Merkle tree with all the log entries. The root of the transaction records and the root of the access log trees could help create a “Mega Meta” tree.

**Applications of Merkle Tree:**

Merkle trees are useful in distributed systems where same data should exist in multiple places.

Merkle trees can be used to check inconsistencies.

Apache Cassandra uses Merkle trees to detect inconsistencies between replicas of entire databases.

It is used in bitcoin and blockchain.

An application that needs to keep track of daily stock trading activity is a perfect example where a Merkle tree might be useful.

Creating a new Merkle tree every time a new transaction record comes up could be one way to ensure that the set of records is safe.

Merkle tree is used in git, Amazon's Dynamo, Cassandra as well as BitCoin.

Currently, the main use of Merkle tree is to make sure that data blocks received from other peers in a peer-to-peer network are received undamaged and unaltered, and even to check that the other peers do not lie and send fake blocks.

**ADVANTAGES OF MERKLE TREE:**

**Validate the integrity of data:** It can be effectively used to validate the integrity of the data.

**Takes little disk space:** Merkle tree takes little disk space compared to other data structures.

**Tiny information across networks:** Merkle trees can be divided into tiny information for verification.

**Efficient verification:** The data structure is efficient and takes only a while to verify the integrity of the data.



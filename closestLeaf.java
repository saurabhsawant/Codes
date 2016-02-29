//http://www.geeksforgeeks.org/find-closest-leaf-binary-tree/
//.http://ideone.com/s3xxFt (preffered)
// BFS ?? with previous leaf and distance based on # and next leaf with distance based on #
// [does not work for non leaf node as I am not going down once i find the node] If leavf node then for every node return which is left most leaf and right most leaf the moment i find a node K/leaf node(on either left or right),
// I check if on left then get the extreme left node of right subtree else get extrenme right right ,leaf of left sub tree. once found, just propogate upwards

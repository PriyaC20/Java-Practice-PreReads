// Performing reduce operation for sum of all the numbers of an array

let reduce = (array, callback) => {
    return performReduce(array, 0, 5, callback);
}

let performReduce = (array, index, size, callback) => {
    if(index==size)
        return sum;
    else {
        sum = callback(sum, array[index]);
        return performReduce(array, index+1, size, callback);
    }
}

let callback = (sum, num) => {
    return sum + num;
}

let sum = 0;
let array = [1,2,3,4,5];
console.log(reduce(array, callback));

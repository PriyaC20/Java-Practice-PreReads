// Performing forEach operation for multiplying each element in an array with 10

let forEach = (array, callback) => {
    return performForEach(array, 0, 5, callback);
}

let performForEach = (array, index, size, callback) => {
    if(index==size)
        return array;
    else {
        array[index] = callback(array[index]);
        return performForEach(array, index+1, size, callback);
    }
}

let callback = (num) => {
    return num * 10;
}

let array = [1,2,3,4,5];
console.log(forEach(array, callback));
// Performing map operation for squaring each number in an array

let map = (array, callback) => {
    return performMap(array, 0, 5, callback);
}

let performMap = (array, index, size, callback) => {
    if(index==size)
        return result;
    else {
        result[index] = callback(array[index]);
        return performMap(array, index+1, size, callback);
    }
}

let callback = (num) => {
    return num * num;
}


let result = [];
let array = [1,2,3,4,5];
console.log(map(array, callback));

// Performing filter operation for filtering only the even elements out of an array

let filter = (array, callback) => {
    return performFilter(array, 0, 5, 0, callback);
}

let performFilter = (array, array_index, size, result_index, callback) => {
    if(array_index==size)
        return result;
    else {
        if(callback(array[array_index])) {
            result[result_index] = array[array_index];
            result_index++;
        }
        return performFilter(array, array_index+1, size, result_index, callback);
    }
}

let callback = (num) => {
    return (num%2 == 0);
}


let result = [];
let array = [1,2,3,4,5];
console.log(filter(array, callback));

function printingPattern(rowsNumber) {
    if (!rowsNumber || rowsNumber <= 0) {
        console.log("Specify a positive number!");
        return [];
    }

    let result = [];
    let currentNumber = 1;

    for (let row = 1; row <= rowsNumber; row++) {
        let newRowArr = [];

        for (let n = 0; n < row; n++) { // Fix: Start from 0
            newRowArr.push(currentNumber);
            currentNumber++;
        }

        result.push(newRowArr);
    }

    return result;
}

console.log(printingPattern(5));

function drawPascalsTriangle(rows){
    let result = []
 
    for(let row = 0; row < rows; row++){
        result[row] = []

        for(let item = 0; item <= row; item++){
           if(item === 0 || item === row){
            result[row][item] = 1
           } else {
            result[row][item]=result[row-1][item-1] + result[row-1][item]
           }
        }
    }
    
    return result
}

drawPascalsTriangle()

console.log(drawPascalsTriangle(5))
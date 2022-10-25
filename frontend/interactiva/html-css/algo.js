let a = [1,2,3,4,5,6,7,8,9,10,11]

a.forEach((value, index) =>{
    a[index] = index
})
console.log(a)
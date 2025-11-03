// 1. Convert to Arrow Function
// Rewrite the following function using an arrow function:
// function add(a, b) {
//     return a + b;
// }


const add = (a,b)=>{return a+b;};
console.log(`Question 1 Output:${add(3,4)}\n`);


// 2. Default Parameters
// Create a function greet that takes two parameters, 
// name and message. If the message is not provided, it should default to "Welcome!". Use default parameters in your implementation.

const greet = (name, message = "Welcome!") => {
    console.log(`${message}, ${name}!`);
}

console.log("Qestion 2 output: ")
greet("Himanshu");  
greet("Prakhar deep", "Hello there"); 



// 3. Template Literals
// Write a function formatString that takes a name and an age and returns a sentence in the format:
// "Hello, my name is [name] and I am [age] years old."

const formatString = (name,age)=>{
    return `Hello, my name is ${name} and I am ${age} years old.`;

}

console.log("\nQestion 3 output: ")
console.log(formatString("Prakhar",22));



// 4. Object Destructuring
// Given the following object:
const person = {
    name: 'Alice',
    age: 25,
    address: {
        city: 'New York',
        country: 'NY'
    }
};
// Write a function that extracts the name and city properties and logs the sentence: "Alice lives in New York." It should also access and log the address object.


const extractDetails = (person) => {
    const { name, address: { city } } = person;
    console.log(`${name} lives in ${city}.`);
    console.log('Address:', person.address);
}

console.log("\nQestion 4 output: ");
extractDetails(person);

// 5. Rest Operator
// Write a function sumAll that takes any number of arguments and returns their sum. Use the rest operator to handle the arguments.
const sumAll = (...args) => {
    return args.reduce((acc, curr) => acc + curr, 0);
};
console.log("\nQestion 5 output: ");
console.log(sumAll(1, 2, 3, 4)); 


// 6. Filter Even Numbers
// Write a function filterEvens that takes an array of numbers and returns a new array containing only the even numbers. Use the filter method.
// Example:
// filterEvens([1, 2, 3, 4, 5, 6]); // Output: [2, 4, 6]
const filterEvens = (arr) => {
    return arr.filter(num => num % 2 === 0);
};
console.log("\nQestion 6 output: ");
console.log(filterEvens([1, 2, 3, 4, 5, 6])); 


// 7. Array Mapping
// Write a function doubleValues that takes an array of numbers and returns a new array where each number is doubled. Use the map method.
// Example:
// doubleValues([1, 2, 3]); // Output: [2, 4, 6]
const doubleValues = (arr) => {
    return arr.map(num => num * 2);
};
console.log("\nQestion 7 output: ");
console.log(doubleValues([1, 2, 3])); 


// 8. Find the Maximum
// Write a function findMax that takes an array of numbers and returns the largest number in the array. Use the spread operator.
// Example:
// findMax([3, 5, 7, 2, 8]); // Output: 8
const findMax = (arr) => {
    return Math.max(...arr);
};
console.log("\nQestion 8 output: ");
console.log(findMax([3, 5, 7, 2, 8])); 


// 9. Object and Array Destructuring
// Given the following data:
// const data = [
//   { name: "Bob", age: 24 },
//   { name: "Alice", age: 21 }
// ]
// Write a function that extracts the age as “24” and name as “Alice” and returns a sentence: "Alice’s age is 24."
const data = [
    { name: "Bob", age: 24 },
    { name: "Alice", age: 21 }
];

const extractDetailsSec = (arr) => {
    const { name, age } = arr.find(person => person.name === "Alice");
    return `${name}’s age is ${age}.`;
};
console.log("\nQestion 9 output: ");
console.log(extractDetailsSec(data)); 


// 10. Data Manipulation using Array functions
// Write a function that manipulates data in such a way that it returns an array of objects again but with the selected keys only.
// Input:
// [{
//   "id": 1,
//   "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
//   "price": 109.95,
//   "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
//   "category": "men's clothing",
//   "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
//   "rating": { "rate": 3.9, "count": 120 }
// }]
// Output:
// [{
//   "id": 1,
//   "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
//   "rate": 3.9,
//   "count": 120
// }]
const productData = [{
    "id": 1,
    "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
    "price": 109.95,
    "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
    "category": "men's clothing",
    "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
    "rating": { "rate": 3.9, "count": 120 }
}];

const manipulateData = (arr) => {
    return arr.map(item => {
        const { id, title, rating: { rate, count } } = item;
        return { id, title, rate, count };
    });
};
console.log("\nQestion 10 output: ");
console.log(manipulateData(productData));


/* 11. Default Parameter
const fun = (name = "abc") => {
    if (name) {
        console.log("if", name);
    } else {
        console.log("else", name);
    }
};
  
fun(""); 
Output: "if" ""
*/
const fun = (name = "abc") => {
    if (name) {
        console.log("if", name);
    } else {
        console.log("else", name);
    }
};
console.log("\nQestion 11 output: ");
fun(""); // Output: "if" ""


// 12. Deep Clone Objects
// Write a function deepClone that creates a deep copy of a given object. Ensure that nested objects and arrays are properly cloned without retaining references to the original object.
// Example:
// const obj = { a: 1, b: { c: 2 } };
// const clonedObj = deepClone(obj);
// clonedObj.b.c = 42;
// console.log(obj.b.c); // Output: 2
const deepClone = (obj) => {
    return JSON.parse(JSON.stringify(obj));  // A simple way to deep clone an object
};

const obj = { a: 1, b: { c: 2 } };
const clonedObj = deepClone(obj);
clonedObj.b.c = 42;
console.log("\nQestion 12 output: ");
console.log(obj.b.c); 


// 13. Flatten Nested Arrays
// Write a function flattenArray that takes a nested array and returns a flattened array. Use recursion and/or ES6 methods to solve this problem.
// Example:
// flattenArray([1, [2, [3, [4, 5]]]]); // Output: [1, 2, 3, 4, 5]


const flattenArray = (arr) => {
    let result = [];
    
    arr.forEach(item => {
        if (Array.isArray(item)) {
            result = result.concat(flattenArray(item));
        } else {
            result.push(item);
        }
    });
    
    return result;
};

console.log("\nQestion 13 output: ");
console.log(flattenArray([1, [2, [3, [4, 5]]]]));



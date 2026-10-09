/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let a=0;
    let b=1;
    while(true){
        yield a;
        let nx=a+b;
        a=b;
        b=nx;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */
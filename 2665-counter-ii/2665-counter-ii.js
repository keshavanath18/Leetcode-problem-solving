var createCounter = function(init) {
    let c=init;
    return{
        increment:function(){
            c++;
            return c;
        },
        reset:function(){
            c=init;
            return c;
        },
        decrement:function(){
            c--;
            return c;
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
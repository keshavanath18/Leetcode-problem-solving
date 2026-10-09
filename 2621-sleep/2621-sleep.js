async function sleep(millis) {
    return new Promise((rev=>{
        setTimeout(rev,millis);
    }));
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */
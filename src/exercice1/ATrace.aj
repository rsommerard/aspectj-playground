package exercice1;

public aspect ATrace {

	pointcut toBeTraced(): 
		call( void print(String)) || 
		execution( void print(String));
	
	before(): toBeTraced() {
		Object[] args = thisJoinPoint.getArgs();
		Object src = thisJoinPoint.getThis();
		Object tgt = thisJoinPoint.getTarget();
		Object sign = thisJoinPoint.getSignature();
		
		System.out.println("src: " + src);
		System.out.println("tgt: " + tgt);
		System.out.println("sign: " + sign);
		System.out.println("arg: " + args);
		
	}
}

public abstract class org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # static fields */
	 public static final org.anddev.andengine.util.modifier.ease.IEaseFunction DEFAULT;
	 /* # direct methods */
	 static org.anddev.andengine.util.modifier.ease.IEaseFunction ( ) {
		 /* .locals 1 */
		 org.anddev.andengine.util.modifier.ease.EaseLinear .getInstance ( );
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 } // .end method

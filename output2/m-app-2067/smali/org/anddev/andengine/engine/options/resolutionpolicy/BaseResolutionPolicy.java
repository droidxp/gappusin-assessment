public abstract class org.anddev.andengine.engine.options.resolutionpolicy.BaseResolutionPolicy implements org.anddev.andengine.engine.options.resolutionpolicy.IResolutionPolicy {
	 /* # interfaces */
	 /* # direct methods */
	 public org.anddev.andengine.engine.options.resolutionpolicy.BaseResolutionPolicy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 protected static void throwOnNotMeasureSpecEXACTLY ( Integer p0, Integer p1 ) {
		 /* .locals 3 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 v0 = 		 android.view.View$MeasureSpec .getMode ( p0 );
		 v1 = 		 android.view.View$MeasureSpec .getMode ( p1 );
		 /* if-ne v0, v2, :cond_0 */
		 /* if-eq v1, v2, :cond_1 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 final String v1 = "This IResolutionPolicy requires MeasureSpec.EXACTLY ! That means "; // const-string v1, "This IResolutionPolicy requires MeasureSpec.EXACTLY ! That means "
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_1
return;
} // .end method

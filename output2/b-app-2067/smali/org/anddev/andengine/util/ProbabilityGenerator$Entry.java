class org.anddev.andengine.util.ProbabilityGenerator$Entry {
	 /* # instance fields */
	 public final java.lang.Object mData;
	 public final Float mFactor;
	 /* # direct methods */
	 public org.anddev.andengine.util.ProbabilityGenerator$Entry ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/util/ProbabilityGenerator$Entry;->mFactor:F */
		 this.mData = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object getReturnValue ( ) {
		 /* .locals 2 */
		 v0 = this.mData;
		 /* array-length v0, v0 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-ne v0, v1, :cond_0 */
		 v0 = this.mData;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget-object v0, v0, v1 */
	 } // :goto_0
} // :cond_0
v0 = this.mData;
org.anddev.andengine.util.ArrayUtils .random ( v0 );
} // .end method

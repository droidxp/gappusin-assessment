class org.anddev.andengine.util.modifier.IModifier$1 implements java.util.Comparator {
	 /* # interfaces */
	 /* # direct methods */
	 org.anddev.andengine.util.modifier.IModifier$1 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* check-cast p1, Lorg/anddev/andengine/util/modifier/IModifier; */
		 /* check-cast p2, Lorg/anddev/andengine/util/modifier/IModifier; */
		 v0 = 		 (( org.anddev.andengine.util.modifier.IModifier$1 ) p0 ).compare ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/util/modifier/IModifier$1;->compare(Lorg/anddev/andengine/util/modifier/IModifier;Lorg/anddev/andengine/util/modifier/IModifier;)I
	 } // .end method
	 public Integer compare ( org.anddev.andengine.util.modifier.IModifier p0, org.anddev.andengine.util.modifier.IModifier p1 ) {
		 v1 = 		 v0 = 		 /* .locals 2 */
		 /* sub-float/2addr v0, v1 */
		 v0 = 		 java.lang.Math .signum ( v0 );
		 /* float-to-int v0, v0 */
	 } // .end method

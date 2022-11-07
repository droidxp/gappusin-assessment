public class org.anddev.andengine.util.ProbabilityGenerator {
	 /* # instance fields */
	 private final java.util.ArrayList mEntries;
	 private Float mProbabilitySum;
	 /* # direct methods */
	 public org.anddev.andengine.util.ProbabilityGenerator ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mEntries = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void add ( Float p0, java.lang.Object...p1 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/ProbabilityGenerator;->mProbabilitySum:F */
		 /* add-float/2addr v0, p1 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/ProbabilityGenerator;->mProbabilitySum:F */
		 v0 = this.mEntries;
		 /* new-instance v1, Lorg/anddev/andengine/util/ProbabilityGenerator$Entry; */
		 /* invoke-direct {v1, p1, p2}, Lorg/anddev/andengine/util/ProbabilityGenerator$Entry;-><init>(F[Ljava/lang/Object;)V */
		 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 return;
	 } // .end method
	 public void clear ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/util/ProbabilityGenerator;->mProbabilitySum:F */
		 v0 = this.mEntries;
		 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
		 return;
	 } // .end method
	 public java.lang.Object next ( ) {
		 /* .locals 7 */
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 /* iget v0, p0, Lorg/anddev/andengine/util/ProbabilityGenerator;->mProbabilitySum:F */
		 v0 = 		 org.anddev.andengine.util.MathUtils .random ( v4,v0 );
		 v1 = this.mEntries;
		 v2 = 		 (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
		 /* sub-int/2addr v2, v5 */
		 /* move v6, v2 */
		 /* move v2, v0 */
		 /* move v0, v6 */
	 } // :goto_0
	 /* if-gez v0, :cond_0 */
	 v0 = 	 (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
	 /* sub-int/2addr v0, v5 */
	 (( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast p0, Lorg/anddev/andengine/util/ProbabilityGenerator$Entry; */
	 (( org.anddev.andengine.util.ProbabilityGenerator$Entry ) p0 ).getReturnValue ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/ProbabilityGenerator$Entry;->getReturnValue()Ljava/lang/Object;
} // :goto_1
} // :cond_0
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/util/ProbabilityGenerator$Entry; */
/* iget v3, p0, Lorg/anddev/andengine/util/ProbabilityGenerator$Entry;->mFactor:F */
/* sub-float/2addr v2, v3 */
/* cmpg-float v3, v2, v4 */
/* if-gtz v3, :cond_1 */
(( org.anddev.andengine.util.ProbabilityGenerator$Entry ) p0 ).getReturnValue ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/ProbabilityGenerator$Entry;->getReturnValue()Ljava/lang/Object;
} // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // .end method

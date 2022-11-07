public class org.anddev.andengine.util.MultiKey {
	 /* # instance fields */
	 private final Integer mCachedHashCode;
	 private final java.lang.Object mKeys;
	 /* # direct methods */
	 public org.anddev.andengine.util.MultiKey ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mKeys = p1;
		 v0 = 		 org.anddev.andengine.util.MultiKey .hash ( p1 );
		 /* iput v0, p0, Lorg/anddev/andengine/util/MultiKey;->mCachedHashCode:I */
		 return;
	 } // .end method
	 public static Integer hash ( java.lang.Object...p0 ) {
		 /* .locals 4 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* array-length v0, p0 */
		 /* move v2, v1 */
	 } // :goto_0
	 /* if-lt v1, v0, :cond_0 */
} // :cond_0
/* aget-object v3, p0, v1 */
if ( v3 != null) { // if-eqz v3, :cond_1
	 v3 = 	 (( java.lang.Object ) v3 ).hashCode ( ); // invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I
	 /* xor-int/2addr v2, v3 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 2 */
/* if-ne p1, p0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
/* instance-of v0, p1, Lorg/anddev/andengine/util/MultiKey; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast p1, Lorg/anddev/andengine/util/MultiKey; */
v0 = this.mKeys;
v1 = this.mKeys;
v0 = java.util.Arrays .equals ( v0,v1 );
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.Object getKey ( Integer p0 ) {
/* .locals 1 */
v0 = this.mKeys;
/* aget-object v0, v0, p1 */
} // .end method
public java.lang.Object getKeys ( ) {
/* .locals 1 */
v0 = this.mKeys;
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/MultiKey;->mCachedHashCode:I */
} // .end method
public Integer size ( ) {
/* .locals 1 */
v0 = this.mKeys;
/* array-length v0, v0 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "MultiKey"; // const-string v1, "MultiKey"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.mKeys;
java.util.Arrays .asList ( v1 );
(( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method

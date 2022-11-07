public abstract class org.codehaus.jackson.sym.Name {
	 /* .source "Name.java" */
	 /* # instance fields */
	 protected final Integer mHashCode;
	 protected final java.lang.String mName;
	 /* # direct methods */
	 protected org.codehaus.jackson.sym.Name ( ) {
		 /* .locals 0 */
		 /* .param p1, "name" # Ljava/lang/String; */
		 /* .param p2, "hashCode" # I */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 17 */
		 this.mName = p1;
		 /* .line 18 */
		 /* iput p2, p0, Lorg/codehaus/jackson/sym/Name;->mHashCode:I */
		 /* .line 19 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract Boolean equals ( Integer p0 ) {
	 } // .end method
	 public abstract Boolean equals ( Integer p0, Integer p1 ) {
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 /* .param p1, "o" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 51 */
		 /* if-ne p1, p0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public abstract Boolean equals ( Integer[] p0, Integer p1 ) {
} // .end method
public java.lang.String getName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 21 */
v0 = this.mName;
} // .end method
public final Integer hashCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 45 */
/* iget v0, p0, Lorg/codehaus/jackson/sym/Name;->mHashCode:I */
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = this.mName;
} // .end method

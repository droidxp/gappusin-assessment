public class com.wiyun.engine.chipmunk.Constraint {
	 /* .source "Constraint.java" */
	 /* # instance fields */
	 Integer mPointer;
	 /* # direct methods */
	 public com.wiyun.engine.chipmunk.Constraint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 22 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.chipmunk.Constraint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 25 */
		 /* iput p1, p0, Lcom/wiyun/engine/chipmunk/Constraint;->mPointer:I */
		 /* .line 26 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Constraint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/Constraint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/Constraint;-><init>(I)V */
} // .end method
/* # virtual methods */
public native void destroy ( ) {
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "o" # Ljava/lang/Object; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 34 */
/* instance-of v1, p1, Lcom/wiyun/engine/chipmunk/Constraint; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 35 */
	 /* check-cast p1, Lcom/wiyun/engine/chipmunk/Constraint; */
} // .end local p1 # "o":Ljava/lang/Object;
/* iget v1, p1, Lcom/wiyun/engine/chipmunk/Constraint;->mPointer:I */
/* iget v2, p0, Lcom/wiyun/engine/chipmunk/Constraint;->mPointer:I */
/* if-ne v1, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 37 */
} // :cond_0
} // .end method
public native Float getBias ( ) {
} // .end method
public native Float getMaxBias ( ) {
} // .end method
public native Float getMaxForce ( ) {
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
/* iget v0, p0, Lcom/wiyun/engine/chipmunk/Constraint;->mPointer:I */
} // .end method
public native void setBias ( Float p0 ) {
} // .end method
public native void setMaxBias ( Float p0 ) {
} // .end method
public native void setMaxForce ( Float p0 ) {
} // .end method
public void setPointer ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "pointer" # I */
/* .prologue */
/* .line 29 */
/* iput p1, p0, Lcom/wiyun/engine/chipmunk/Constraint;->mPointer:I */
/* .line 30 */
return;
} // .end method

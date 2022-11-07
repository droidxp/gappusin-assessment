public abstract class com.wiyun.engine.BaseObject {
	 /* .source "BaseObject.java" */
	 /* # instance fields */
	 protected Integer mPointer;
	 /* # direct methods */
	 protected com.wiyun.engine.BaseObject ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 26 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.BaseObject ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 29 */
		 /* iput p1, p0, Lcom/wiyun/engine/BaseObject;->mPointer:I */
		 /* .line 30 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 /* .param p1, "o" # Ljava/lang/Object; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 70 */
		 /* instance-of v1, p1, Lcom/wiyun/engine/BaseObject; */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 71 */
			 /* iget v1, p0, Lcom/wiyun/engine/BaseObject;->mPointer:I */
			 /* check-cast p1, Lcom/wiyun/engine/BaseObject; */
		 } // .end local p1 # "o":Ljava/lang/Object;
		 v2 = 		 (( com.wiyun.engine.BaseObject ) p1 ).getPointer ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/BaseObject;->getPointer()I
		 /* if-ne v1, v2, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 73 */
	 } // :cond_0
} // .end method
public Integer getPointer ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 65 */
	 /* iget v0, p0, Lcom/wiyun/engine/BaseObject;->mPointer:I */
} // .end method
public Integer hashCode ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 78 */
	 /* iget v0, p0, Lcom/wiyun/engine/BaseObject;->mPointer:I */
} // .end method
public void setPointer ( Integer p0 ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 50 */
	 /* iput p1, p0, Lcom/wiyun/engine/BaseObject;->mPointer:I */
	 /* .line 51 */
	 return;
} // .end method

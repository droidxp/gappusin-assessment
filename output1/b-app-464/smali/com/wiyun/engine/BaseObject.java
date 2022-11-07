public abstract class com.wiyun.engine.BaseObject {
	 /* # instance fields */
	 protected Integer mPointer;
	 /* # direct methods */
	 public com.wiyun.engine.BaseObject ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.BaseObject ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/wiyun/engine/BaseObject;->mPointer:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* instance-of v1, p1, Lcom/wiyun/engine/BaseObject; */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* iget v1, p0, Lcom/wiyun/engine/BaseObject;->mPointer:I */
			 /* check-cast p1, Lcom/wiyun/engine/BaseObject; */
			 v2 = 			 (( com.wiyun.engine.BaseObject ) p1 ).getPointer ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/BaseObject;->getPointer()I
			 /* if-ne v1, v2, :cond_0 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
	 } // .end method
	 public Integer getPointer ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/wiyun/engine/BaseObject;->mPointer:I */
	 } // .end method
	 public Integer hashCode ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/wiyun/engine/BaseObject;->mPointer:I */
	 } // .end method
	 public void setPointer ( Integer p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lcom/wiyun/engine/BaseObject;->mPointer:I */
		 return;
	 } // .end method

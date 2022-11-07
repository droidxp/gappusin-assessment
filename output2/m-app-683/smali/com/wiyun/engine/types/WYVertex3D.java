public class com.wiyun.engine.types.WYVertex3D {
	 /* .source "WYVertex3D.java" */
	 /* # static fields */
	 public static final Integer GL_SIZE;
	 /* # instance fields */
	 public Float x;
	 public Float y;
	 public Float z;
	 /* # direct methods */
	 protected com.wiyun.engine.types.WYVertex3D ( ) {
		 /* .locals 0 */
		 /* .param p1, "x" # F */
		 /* .param p2, "y" # F */
		 /* .param p3, "z" # F */
		 /* .prologue */
		 /* .line 44 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 45 */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYVertex3D;->x:F */
		 /* .line 46 */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYVertex3D;->y:F */
		 /* .line 47 */
		 /* iput p3, p0, Lcom/wiyun/engine/types/WYVertex3D;->z:F */
		 /* .line 48 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYVertex3D make ( Float p0, Float p1, Float p2 ) {
		 /* .locals 1 */
		 /* .param p0, "x" # F */
		 /* .param p1, "y" # F */
		 /* .param p2, "z" # F */
		 /* .prologue */
		 /* .line 34 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYVertex3D; */
		 /* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/types/WYVertex3D;-><init>(FFF)V */
	 } // .end method
	 public static com.wiyun.engine.types.WYVertex3D makeZero ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 22 */
		 com.wiyun.engine.types.WYVertex3D .make ( v0,v0,v0 );
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 52 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "<"; // const-string v1, "<"
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYVertex3D;->x:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", "; // const-string v1, ", "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYVertex3D;->y:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", "; // const-string v1, ", "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYVertex3D;->z:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ">"; // const-string v1, ">"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method

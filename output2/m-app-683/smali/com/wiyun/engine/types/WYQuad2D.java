public class com.wiyun.engine.types.WYQuad2D {
	 /* .source "WYQuad2D.java" */
	 /* # static fields */
	 public static final Integer GL_SIZE;
	 /* # instance fields */
	 public Float bl_x;
	 public Float bl_y;
	 public Float br_x;
	 public Float br_y;
	 public Float tl_x;
	 public Float tl_y;
	 public Float tr_x;
	 public Float tr_y;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYQuad2D ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 33 */
		 /* const/16 v0, 0x8 */
		 /* new-array v0, v0, [F */
		 /* fill-array-data v0, :array_0 */
		 /* .line 34 */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/types/WYQuad2D;-><init>([F)V */
		 /* .line 36 */
		 return;
		 /* .line 33 */
		 /* nop */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x0 */
		 /* 0x0 */
		 /* 0x0 */
		 /* 0x0 */
		 /* 0x0 */
		 /* 0x0 */
		 /* 0x0 */
		 /* 0x0 */
	 } // .end array-data
} // .end method
public com.wiyun.engine.types.WYQuad2D ( ) {
	 /* .locals 0 */
	 /* .param p1, "a" # F */
	 /* .param p2, "b" # F */
	 /* .param p3, "c" # F */
	 /* .param p4, "d" # F */
	 /* .param p5, "e" # F */
	 /* .param p6, "f" # F */
	 /* .param p7, "g" # F */
	 /* .param p8, "h" # F */
	 /* .prologue */
	 /* .line 21 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 22 */
	 /* iput p1, p0, Lcom/wiyun/engine/types/WYQuad2D;->bl_x:F */
	 /* .line 23 */
	 /* iput p2, p0, Lcom/wiyun/engine/types/WYQuad2D;->bl_y:F */
	 /* .line 24 */
	 /* iput p3, p0, Lcom/wiyun/engine/types/WYQuad2D;->br_x:F */
	 /* .line 25 */
	 /* iput p4, p0, Lcom/wiyun/engine/types/WYQuad2D;->br_y:F */
	 /* .line 26 */
	 /* iput p5, p0, Lcom/wiyun/engine/types/WYQuad2D;->tl_x:F */
	 /* .line 27 */
	 /* iput p6, p0, Lcom/wiyun/engine/types/WYQuad2D;->tl_y:F */
	 /* .line 28 */
	 /* iput p7, p0, Lcom/wiyun/engine/types/WYQuad2D;->tr_x:F */
	 /* .line 29 */
	 /* iput p8, p0, Lcom/wiyun/engine/types/WYQuad2D;->tr_y:F */
	 /* .line 30 */
	 return;
} // .end method
public com.wiyun.engine.types.WYQuad2D ( ) {
	 /* .locals 9 */
	 /* .param p1, "f" # [F */
	 /* .prologue */
	 /* .line 39 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* aget v1, p1, v0 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* aget v2, p1, v0 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* aget v3, p1, v0 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* aget v4, p1, v0 */
	 int v0 = 4; // const/4 v0, 0x4
	 /* aget v5, p1, v0 */
	 int v0 = 5; // const/4 v0, 0x5
	 /* aget v6, p1, v0 */
	 int v0 = 6; // const/4 v0, 0x6
	 /* aget v7, p1, v0 */
	 int v0 = 7; // const/4 v0, 0x7
	 /* aget v8, p1, v0 */
	 /* move-object v0, p0 */
	 /* invoke-direct/range {v0 ..v8}, Lcom/wiyun/engine/types/WYQuad2D;-><init>(FFFFFFFF)V */
	 /* .line 40 */
	 return;
} // .end method
/* # virtual methods */
public glFormat ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 43 */
	 /* const/16 v0, 0x8 */
	 /* new-array v0, v0, [F */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 44 */
	 /* iget v2, p0, Lcom/wiyun/engine/types/WYQuad2D;->bl_x:F */
	 /* aput v2, v0, v1 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* iget v2, p0, Lcom/wiyun/engine/types/WYQuad2D;->bl_y:F */
	 /* aput v2, v0, v1 */
	 int v1 = 2; // const/4 v1, 0x2
	 /* iget v2, p0, Lcom/wiyun/engine/types/WYQuad2D;->br_x:F */
	 /* aput v2, v0, v1 */
	 int v1 = 3; // const/4 v1, 0x3
	 /* iget v2, p0, Lcom/wiyun/engine/types/WYQuad2D;->br_y:F */
	 /* aput v2, v0, v1 */
	 int v1 = 4; // const/4 v1, 0x4
	 /* iget v2, p0, Lcom/wiyun/engine/types/WYQuad2D;->tl_x:F */
	 /* aput v2, v0, v1 */
	 int v1 = 5; // const/4 v1, 0x5
	 /* iget v2, p0, Lcom/wiyun/engine/types/WYQuad2D;->tl_y:F */
	 /* aput v2, v0, v1 */
	 int v1 = 6; // const/4 v1, 0x6
	 /* iget v2, p0, Lcom/wiyun/engine/types/WYQuad2D;->tr_x:F */
	 /* aput v2, v0, v1 */
	 int v1 = 7; // const/4 v1, 0x7
	 /* iget v2, p0, Lcom/wiyun/engine/types/WYQuad2D;->tr_y:F */
	 /* aput v2, v0, v1 */
	 /* .line 43 */
} // .end method
public java.lang.String toString ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 50 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 final String v1 = "CCQuad2: ( "; // const-string v1, "CCQuad2: ( "
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* iget v1, p0, Lcom/wiyun/engine/types/WYQuad2D;->tl_x:F */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v1 = ", "; // const-string v1, ", "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v1, p0, Lcom/wiyun/engine/types/WYQuad2D;->tl_y:F */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v1 = " "; // const-string v1, " "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v1, p0, Lcom/wiyun/engine/types/WYQuad2D;->tr_x:F */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v1 = ", "; // const-string v1, ", "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v1, p0, Lcom/wiyun/engine/types/WYQuad2D;->tr_y:F */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v1 = " "; // const-string v1, " "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v1, p0, Lcom/wiyun/engine/types/WYQuad2D;->bl_x:F */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v1 = ", "; // const-string v1, ", "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v1, p0, Lcom/wiyun/engine/types/WYQuad2D;->bl_y:F */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v1 = " "; // const-string v1, " "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v1, p0, Lcom/wiyun/engine/types/WYQuad2D;->br_x:F */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v1 = ", "; // const-string v1, ", "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v1, p0, Lcom/wiyun/engine/types/WYQuad2D;->br_y:F */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v1 = " )"; // const-string v1, " )"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method

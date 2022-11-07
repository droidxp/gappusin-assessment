public class com.wiyun.engine.types.WYColor4B {
	 /* # static fields */
	 public static final Integer GL_SIZE;
	 /* # instance fields */
	 public Integer a;
	 public Integer b;
	 public Integer g;
	 public Integer r;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYColor4B ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/16 v0, 0xff */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4B;->a:I */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4B;->b:I */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4B;->g:I */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4B;->r:I */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor4B ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYColor4B;->r:I */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYColor4B;->g:I */
		 /* iput p3, p0, Lcom/wiyun/engine/types/WYColor4B;->b:I */
		 /* iput p4, p0, Lcom/wiyun/engine/types/WYColor4B;->a:I */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYColor4B make ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor4B; */
		 /* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/types/WYColor4B;-><init>(IIII)V */
	 } // .end method
	 /* # virtual methods */
	 public Integer androidColor ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYColor4B;->a:I */
		 /* shl-int/lit8 v0, v0, 0x18 */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor4B;->r:I */
		 /* shl-int/lit8 v1, v1, 0x10 */
		 /* or-int/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor4B;->g:I */
		 /* shl-int/lit8 v1, v1, 0x8 */
		 /* or-int/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor4B;->b:I */
		 /* or-int/2addr v0, v1 */
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 5 */
		 int v0 = 1; // const/4 v0, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/high16 v4, 0x437f0000 # 255.0f */
		 /* instance-of v2, p1, Lcom/wiyun/engine/types/WYColor3B; */
		 if ( v2 != null) { // if-eqz v2, :cond_2
			 /* check-cast p1, Lcom/wiyun/engine/types/WYColor3B; */
			 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->r:I */
			 /* iget v3, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
			 /* if-ne v2, v3, :cond_1 */
			 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->g:I */
			 /* iget v3, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
			 /* if-ne v2, v3, :cond_1 */
			 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->b:I */
			 /* iget v3, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
			 /* if-ne v2, v3, :cond_1 */
		 } // :cond_0
	 } // :goto_0
} // :cond_1
/* move v0, v1 */
} // :cond_2
/* instance-of v2, p1, Lcom/wiyun/engine/types/WYColor4B; */
if ( v2 != null) { // if-eqz v2, :cond_4
/* check-cast p1, Lcom/wiyun/engine/types/WYColor4B; */
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->r:I */
/* iget v3, p1, Lcom/wiyun/engine/types/WYColor4B;->r:I */
/* if-ne v2, v3, :cond_3 */
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->g:I */
/* iget v3, p1, Lcom/wiyun/engine/types/WYColor4B;->g:I */
/* if-ne v2, v3, :cond_3 */
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->b:I */
/* iget v3, p1, Lcom/wiyun/engine/types/WYColor4B;->b:I */
/* if-ne v2, v3, :cond_3 */
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->a:I */
/* iget v3, p1, Lcom/wiyun/engine/types/WYColor4B;->b:I */
/* if-eq v2, v3, :cond_0 */
} // :cond_3
/* move v0, v1 */
} // :cond_4
/* instance-of v2, p1, Lcom/wiyun/engine/types/WYColor4F; */
if ( v2 != null) { // if-eqz v2, :cond_6
/* check-cast p1, Lcom/wiyun/engine/types/WYColor4F; */
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->r:I */
/* iget v3, p1, Lcom/wiyun/engine/types/WYColor4F;->r:F */
/* mul-float/2addr v3, v4 */
/* float-to-int v3, v3 */
/* if-ne v2, v3, :cond_5 */
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->g:I */
/* iget v3, p1, Lcom/wiyun/engine/types/WYColor4F;->g:F */
/* mul-float/2addr v3, v4 */
/* float-to-int v3, v3 */
/* if-ne v2, v3, :cond_5 */
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->b:I */
/* iget v3, p1, Lcom/wiyun/engine/types/WYColor4F;->b:F */
/* mul-float/2addr v3, v4 */
/* float-to-int v3, v3 */
/* if-ne v2, v3, :cond_5 */
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->a:I */
/* iget v3, p1, Lcom/wiyun/engine/types/WYColor4F;->a:F */
/* mul-float/2addr v3, v4 */
/* float-to-int v3, v3 */
/* if-eq v2, v3, :cond_0 */
} // :cond_5
/* move v0, v1 */
} // :cond_6
v0 = /* invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z */
} // .end method
public glFormat ( ) {
/* .locals 3 */
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [B */
int v1 = 0; // const/4 v1, 0x0
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->r:I */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->g:I */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->b:I */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* iget v2, p0, Lcom/wiyun/engine/types/WYColor4B;->a:I */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "< r="; // const-string v1, "< r="
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v1, p0, Lcom/wiyun/engine/types/WYColor4B;->r:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", g="; // const-string v1, ", g="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/wiyun/engine/types/WYColor4B;->g:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", b="; // const-string v1, ", b="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/wiyun/engine/types/WYColor4B;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", a="; // const-string v1, ", a="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/wiyun/engine/types/WYColor4B;->a:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " >"; // const-string v1, " >"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method

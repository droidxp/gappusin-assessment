public class com.wiyun.engine.types.WYAffineTransform implements java.lang.Cloneable implements java.io.Serializable implements com.wiyun.engine.types.ICopyable {
	 /* .source "WYAffineTransform.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer TYPE_FLIP;
	 public static final Integer TYPE_GENERAL_ROTATION;
	 public static final Integer TYPE_GENERAL_SCALE;
	 public static final Integer TYPE_GENERAL_TRANSFORM;
	 public static final Integer TYPE_IDENTITY;
	 public static final Integer TYPE_MASK_ROTATION;
	 public static final Integer TYPE_MASK_SCALE;
	 public static final Integer TYPE_QUADRANT_ROTATION;
	 public static final Integer TYPE_TRANSLATION;
	 public static final Integer TYPE_UNIFORM_SCALE;
	 static final Integer TYPE_UNKNOWN;
	 static final Double ZERO;
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 public Double a;
	 public Double b;
	 public Double c;
	 public Double d;
	 public Double tx;
	 public Double ty;
	 transient Integer type;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYAffineTransform ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 123 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 124 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* .line 125 */
		 /* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* .line 126 */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 /* .line 127 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYAffineTransform ( ) {
		 /* .locals 1 */
		 /* .param p1, "m00" # D */
		 /* .param p3, "m10" # D */
		 /* .param p5, "m01" # D */
		 /* .param p7, "m11" # D */
		 /* .param p9, "m02" # D */
		 /* .param p11, "m12" # D */
		 /* .prologue */
		 /* .line 179 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 180 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* .line 181 */
		 /* iput-wide p1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* .line 182 */
		 /* iput-wide p3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 /* .line 183 */
		 /* iput-wide p5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* .line 184 */
		 /* iput-wide p7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* .line 185 */
		 /* iput-wide p9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* .line 186 */
		 /* iput-wide p11, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 /* .line 187 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYAffineTransform ( ) {
		 /* .locals 2 */
		 /* .param p1, "m00" # F */
		 /* .param p2, "m10" # F */
		 /* .param p3, "m01" # F */
		 /* .param p4, "m11" # F */
		 /* .param p5, "m02" # F */
		 /* .param p6, "m12" # F */
		 /* .prologue */
		 /* .line 157 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 158 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* .line 159 */
		 /* float-to-double v0, p1 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* .line 160 */
		 /* float-to-double v0, p2 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 /* .line 161 */
		 /* float-to-double v0, p3 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* .line 162 */
		 /* float-to-double v0, p4 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* .line 163 */
		 /* float-to-double v0, p5 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* .line 164 */
		 /* float-to-double v0, p6 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 /* .line 165 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYAffineTransform ( ) {
		 /* .locals 2 */
		 /* .param p1, "t" # Lcom/wiyun/engine/types/WYAffineTransform; */
		 /* .prologue */
		 /* .line 135 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 136 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* .line 137 */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* .line 138 */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 /* .line 139 */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* .line 140 */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* .line 141 */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* .line 142 */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 /* .line 143 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYAffineTransform ( ) {
		 /* .locals 3 */
		 /* .param p1, "matrix" # [D */
		 /* .prologue */
		 int v2 = 4; // const/4 v2, 0x4
		 /* .line 231 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 232 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* .line 233 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* aget-wide v0, p1, v0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* .line 234 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* aget-wide v0, p1, v0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 /* .line 235 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* aget-wide v0, p1, v0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* .line 236 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* aget-wide v0, p1, v0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* .line 237 */
		 /* array-length v0, p1 */
		 /* if-le v0, v2, :cond_0 */
		 /* .line 238 */
		 /* aget-wide v0, p1, v2 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* .line 239 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* aget-wide v0, p1, v0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 /* .line 241 */
	 } // :cond_0
	 return;
} // .end method
public com.wiyun.engine.types.WYAffineTransform ( ) {
	 /* .locals 3 */
	 /* .param p1, "matrix" # [F */
	 /* .prologue */
	 int v2 = 4; // const/4 v2, 0x4
	 /* .line 205 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 206 */
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
	 /* .line 207 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* aget v0, p1, v0 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
	 /* .line 208 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* aget v0, p1, v0 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
	 /* .line 209 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* aget v0, p1, v0 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
	 /* .line 210 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* aget v0, p1, v0 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
	 /* .line 211 */
	 /* array-length v0, p1 */
	 /* if-le v0, v2, :cond_0 */
	 /* .line 212 */
	 /* aget v0, p1, v2 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
	 /* .line 213 */
	 int v0 = 5; // const/4 v0, 0x5
	 /* aget v0, p1, v0 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
	 /* .line 215 */
} // :cond_0
return;
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeIdentity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 116 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeRotate ( Double p0 ) {
/* .locals 1 */
/* .param p0, "angle" # D */
/* .prologue */
/* .line 605 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
/* .line 606 */
/* .local v0, "t":Lcom/wiyun/engine/types/WYAffineTransform; */
(( com.wiyun.engine.types.WYAffineTransform ) v0 ).setToRotation ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/wiyun/engine/types/WYAffineTransform;->setToRotation(D)V
/* .line 607 */
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeRotate ( Double p0, Double p1, Double p2 ) {
/* .locals 7 */
/* .param p0, "angle" # D */
/* .param p2, "x" # D */
/* .param p4, "y" # D */
/* .prologue */
/* .line 620 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
/* .local v0, "t":Lcom/wiyun/engine/types/WYAffineTransform; */
/* move-wide v1, p0 */
/* move-wide v3, p2 */
/* move-wide v5, p4 */
/* .line 621 */
/* invoke-virtual/range {v0 ..v6}, Lcom/wiyun/engine/types/WYAffineTransform;->setToRotation(DDD)V */
/* .line 622 */
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeScale ( Double p0, Double p1 ) {
/* .locals 1 */
/* .param p0, "scx" # D */
/* .param p2, "scY" # D */
/* .prologue */
/* .line 574 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
/* .line 575 */
/* .local v0, "t":Lcom/wiyun/engine/types/WYAffineTransform; */
(( com.wiyun.engine.types.WYAffineTransform ) v0 ).setToScale ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/types/WYAffineTransform;->setToScale(DD)V
/* .line 576 */
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeShear ( Double p0, Double p1 ) {
/* .locals 1 */
/* .param p0, "shx" # D */
/* .param p2, "shy" # D */
/* .prologue */
/* .line 590 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
/* .line 591 */
/* .local v0, "m":Lcom/wiyun/engine/types/WYAffineTransform; */
(( com.wiyun.engine.types.WYAffineTransform ) v0 ).setToShear ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/types/WYAffineTransform;->setToShear(DD)V
/* .line 592 */
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeTranslate ( Double p0, Double p1 ) {
/* .locals 1 */
/* .param p0, "mx" # D */
/* .param p2, "my" # D */
/* .prologue */
/* .line 558 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
/* .line 559 */
/* .local v0, "t":Lcom/wiyun/engine/types/WYAffineTransform; */
(( com.wiyun.engine.types.WYAffineTransform ) v0 ).setToTranslation ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/types/WYAffineTransform;->setToTranslation(DD)V
/* .line 560 */
} // .end method
private com.wiyun.engine.types.WYAffineTransform multiply ( com.wiyun.engine.types.WYAffineTransform p0 ) {
/* .locals 20 */
/* .param p1, "t2" # Lcom/wiyun/engine/types/WYAffineTransform; */
/* .prologue */
/* .line 696 */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-wide/from16 v16, v0 */
/* mul-double v14, v14, v16 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-wide/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* add-double v2, v14, v16 */
/* .line 697 */
/* .local v2, "a1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-wide/from16 v16, v0 */
/* mul-double v14, v14, v16 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-wide/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* add-double v4, v14, v16 */
/* .line 698 */
/* .local v4, "b1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-wide/from16 v16, v0 */
/* mul-double v14, v14, v16 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-wide/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* add-double v6, v14, v16 */
/* .line 699 */
/* .local v6, "c1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-wide/from16 v16, v0 */
/* mul-double v14, v14, v16 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-wide/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* add-double v8, v14, v16 */
/* .line 700 */
/* .local v8, "d1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-wide/from16 v16, v0 */
/* mul-double v14, v14, v16 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* move-wide/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* add-double v14, v14, v16 */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-wide/from16 v16, v0 */
/* add-double v10, v14, v16 */
/* .line 701 */
/* .local v10, "tx1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-wide/from16 v16, v0 */
/* mul-double v14, v14, v16 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* move-wide/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* add-double v14, v14, v16 */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* move-wide/from16 v16, v0 */
/* add-double v12, v14, v16 */
/* .line 702 */
/* .local v12, "ty1":D */
/* move-object/from16 v0, p0 */
/* iput-wide v2, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 703 */
/* move-object/from16 v0, p0 */
/* iput-wide v4, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* .line 704 */
/* move-object/from16 v0, p0 */
/* iput-wide v6, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* .line 705 */
/* move-object/from16 v0, p0 */
/* iput-wide v8, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* .line 706 */
/* move-object/from16 v0, p0 */
/* iput-wide v10, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* .line 707 */
/* move-object/from16 v0, p0 */
/* iput-wide v12, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* .line 708 */
} // .end method
private void readObject ( java.io.ObjectInputStream p0 ) {
/* .locals 1 */
/* .param p1, "stream" # Ljava/io/ObjectInputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Ljava/lang/ClassNotFoundException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1123 */
(( java.io.ObjectInputStream ) p1 ).defaultReadObject ( ); // invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V
/* .line 1124 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 1125 */
return;
} // .end method
private void writeObject ( java.io.ObjectOutputStream p0 ) {
/* .locals 0 */
/* .param p1, "stream" # Ljava/io/ObjectOutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1110 */
(( java.io.ObjectOutputStream ) p1 ).defaultWriteObject ( ); // invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V
/* .line 1111 */
return;
} // .end method
/* # virtual methods */
public java.lang.Object clone ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1082 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->copy()Lcom/wiyun/engine/types/WYAffineTransform;
} // .end method
public com.wiyun.engine.types.WYAffineTransform concat ( com.wiyun.engine.types.WYAffineTransform p0 ) {
/* .locals 0 */
/* .param p1, "t" # Lcom/wiyun/engine/types/WYAffineTransform; */
/* .prologue */
/* .line 718 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/types/WYAffineTransform;->multiply(Lcom/wiyun/engine/types/WYAffineTransform;)Lcom/wiyun/engine/types/WYAffineTransform; */
/* .line 719 */
} // .end method
public com.wiyun.engine.types.WYAffineTransform copy ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1069 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
/* .line 1070 */
/* .local v0, "t":Lcom/wiyun/engine/types/WYAffineTransform; */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 1071 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* .line 1072 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* .line 1073 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* .line 1074 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* .line 1075 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* .line 1076 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* iput v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 1077 */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->copy()Lcom/wiyun/engine/types/WYAffineTransform;
} // .end method
public com.wiyun.engine.types.WYPoint deltaTransform ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 8 */
/* .param p1, "src" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "dst" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 946 */
/* if-nez p2, :cond_0 */
/* .line 947 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 950 */
} // :cond_0
/* iget v4, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* float-to-double v0, v4 */
/* .line 951 */
/* .local v0, "x":D */
/* iget v4, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* float-to-double v2, v4 */
/* .line 953 */
/* .local v2, "y":D */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v4, v0 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v6, v2 */
/* add-double/2addr v4, v6 */
/* double-to-float v4, v4 */
/* iput v4, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 954 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v4, v0 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v6, v2 */
/* add-double/2addr v4, v6 */
/* double-to-float v4, v4 */
/* iput v4, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 955 */
} // .end method
public void deltaTransform ( Double[] p0, Integer p1, Double[] p2, Integer p3, Integer p4 ) {
/* .locals 10 */
/* .param p1, "src" # [D */
/* .param p2, "srcOff" # I */
/* .param p3, "dst" # [D */
/* .param p4, "dstOff" # I */
/* .param p5, "length" # I */
/* .prologue */
/* .line 977 */
/* move v0, p4 */
} // .end local p4 # "dstOff":I
/* .local v0, "dstOff":I */
/* move v1, p2 */
} // .end local p2 # "srcOff":I
/* .local v1, "srcOff":I */
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_0 */
/* .line 983 */
return;
/* .line 978 */
} // :cond_0
/* add-int/lit8 p2, v1, 0x1 */
} // .end local v1 # "srcOff":I
/* .restart local p2 # "srcOff":I */
/* aget-wide v2, p1, v1 */
/* .line 979 */
/* .local v2, "x":D */
/* add-int/lit8 v1, p2, 0x1 */
} // .end local p2 # "srcOff":I
/* .restart local v1 # "srcOff":I */
/* aget-wide v4, p1, p2 */
/* .line 980 */
/* .local v4, "y":D */
/* add-int/lit8 p4, v0, 0x1 */
} // .end local v0 # "dstOff":I
/* .restart local p4 # "dstOff":I */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v6, v2 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v8, v4 */
/* add-double/2addr v6, v8 */
/* aput-wide v6, p3, v0 */
/* .line 981 */
/* add-int/lit8 v0, p4, 0x1 */
} // .end local p4 # "dstOff":I
/* .restart local v0 # "dstOff":I */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v6, v2 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v8, v4 */
/* add-double/2addr v6, v8 */
/* aput-wide v6, p3, p4 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 7 */
/* .param p1, "obj" # Ljava/lang/Object; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 1092 */
/* if-ne p1, p0, :cond_1 */
/* .line 1100 */
} // :cond_0
} // :goto_0
/* .line 1095 */
} // :cond_1
/* instance-of v3, p1, Lcom/wiyun/engine/types/WYAffineTransform; */
if ( v3 != null) { // if-eqz v3, :cond_3
/* move-object v0, p1 */
/* .line 1096 */
/* check-cast v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* .line 1097 */
/* .local v0, "t":Lcom/wiyun/engine/types/WYAffineTransform; */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* cmpl-double v3, v3, v5 */
/* if-nez v3, :cond_2 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iget-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* cmpl-double v3, v3, v5 */
/* if-nez v3, :cond_2 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iget-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* cmpl-double v3, v3, v5 */
/* if-nez v3, :cond_2 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iget-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* cmpl-double v3, v3, v5 */
/* if-nez v3, :cond_2 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iget-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* cmpl-double v3, v3, v5 */
/* if-nez v3, :cond_2 */
/* .line 1098 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iget-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* cmpl-double v3, v3, v5 */
if ( v3 != null) { // if-eqz v3, :cond_0
} // :cond_2
/* move v1, v2 */
/* .line 1097 */
} // .end local v0 # "t":Lcom/wiyun/engine/types/WYAffineTransform;
} // :cond_3
/* move v1, v2 */
/* .line 1100 */
} // .end method
public void fromGL ( Float[] p0 ) {
/* .locals 2 */
/* .param p1, "m" # [F */
/* .prologue */
/* .line 1154 */
int v0 = 0; // const/4 v0, 0x0
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 1155 */
int v0 = 4; // const/4 v0, 0x4
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* .line 1156 */
/* const/16 v0, 0xc */
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* .line 1157 */
int v0 = 1; // const/4 v0, 0x1
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* .line 1158 */
int v0 = 5; // const/4 v0, 0x5
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* .line 1159 */
/* const/16 v0, 0xd */
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* .line 1160 */
return;
} // .end method
public Double getDeterminant ( ) {
/* .locals 6 */
/* .prologue */
/* .line 400 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v0, v2 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v2, v4 */
/* sub-double/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public void getMatrix ( Double[] p0 ) {
/* .locals 4 */
/* .param p1, "matrix" # [D */
/* .prologue */
int v3 = 4; // const/4 v3, 0x4
/* .line 384 */
int v0 = 0; // const/4 v0, 0x0
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* aput-wide v1, p1, v0 */
/* .line 385 */
int v0 = 1; // const/4 v0, 0x1
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* aput-wide v1, p1, v0 */
/* .line 386 */
int v0 = 2; // const/4 v0, 0x2
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* aput-wide v1, p1, v0 */
/* .line 387 */
int v0 = 3; // const/4 v0, 0x3
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* aput-wide v1, p1, v0 */
/* .line 388 */
/* array-length v0, p1 */
/* if-le v0, v3, :cond_0 */
/* .line 389 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* aput-wide v0, p1, v3 */
/* .line 390 */
int v0 = 5; // const/4 v0, 0x5
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* aput-wide v1, p1, v0 */
/* .line 392 */
} // :cond_0
return;
} // .end method
public Double getScaleX ( ) {
/* .locals 2 */
/* .prologue */
/* .line 314 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* return-wide v0 */
} // .end method
public Double getScaleY ( ) {
/* .locals 2 */
/* .prologue */
/* .line 324 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* return-wide v0 */
} // .end method
public Double getShearX ( ) {
/* .locals 2 */
/* .prologue */
/* .line 334 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* return-wide v0 */
} // .end method
public Double getShearY ( ) {
/* .locals 2 */
/* .prologue */
/* .line 344 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* return-wide v0 */
} // .end method
public Double getTranslateX ( ) {
/* .locals 2 */
/* .prologue */
/* .line 353 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* return-wide v0 */
} // .end method
public Double getTranslateY ( ) {
/* .locals 2 */
/* .prologue */
/* .line 362 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* return-wide v0 */
} // .end method
public Integer getType ( ) {
/* .locals 15 */
/* .prologue */
/* const-wide/high16 v13, 0x3ff0000000000000L # 1.0 */
/* const-wide/16 v11, 0x0 */
/* .line 268 */
/* iget v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
int v6 = -1; // const/4 v6, -0x1
/* if-eq v5, v6, :cond_1 */
/* .line 269 */
/* iget v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 304 */
} // :cond_0
} // :goto_0
/* .line 272 */
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
/* .line 274 */
/* .local v4, "type":I */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v5, v7 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iget-wide v9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v7, v9 */
/* add-double/2addr v5, v7 */
/* cmpl-double v5, v5, v11 */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 275 */
/* or-int/lit8 v4, v4, 0x20 */
/* .line 276 */
/* .line 279 */
} // :cond_2
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* cmpl-double v5, v5, v11 */
/* if-nez v5, :cond_3 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* cmpl-double v5, v5, v11 */
if ( v5 != null) { // if-eqz v5, :cond_9
/* .line 280 */
} // :cond_3
/* or-int/lit8 v4, v4, 0x1 */
/* .line 286 */
} // :cond_4
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v5, v7 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iget-wide v9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v7, v9 */
/* sub-double/2addr v5, v7 */
/* cmpg-double v5, v5, v11 */
/* if-gez v5, :cond_5 */
/* .line 287 */
/* or-int/lit8 v4, v4, 0x40 */
/* .line 290 */
} // :cond_5
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v5, v7 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iget-wide v9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v7, v9 */
/* add-double v0, v5, v7 */
/* .line 291 */
/* .local v0, "dx":D */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v5, v7 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iget-wide v9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v7, v9 */
/* add-double v2, v5, v7 */
/* .line 292 */
/* .local v2, "dy":D */
/* cmpl-double v5, v0, v2 */
if ( v5 != null) { // if-eqz v5, :cond_a
/* .line 293 */
/* or-int/lit8 v4, v4, 0x4 */
/* .line 298 */
} // :cond_6
} // :goto_1
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* cmpl-double v5, v5, v11 */
/* if-nez v5, :cond_7 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* cmpl-double v5, v5, v11 */
if ( v5 != null) { // if-eqz v5, :cond_8
} // :cond_7
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* cmpl-double v5, v5, v11 */
/* if-nez v5, :cond_b */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* cmpl-double v5, v5, v11 */
/* if-nez v5, :cond_b */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* cmpg-double v5, v5, v11 */
/* if-ltz v5, :cond_8 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* cmpg-double v5, v5, v11 */
/* if-gez v5, :cond_b */
/* .line 299 */
} // :cond_8
/* or-int/lit8 v4, v4, 0x8 */
/* .line 281 */
} // .end local v0 # "dx":D
} // .end local v2 # "dy":D
} // :cond_9
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* cmpl-double v5, v5, v13 */
/* if-nez v5, :cond_4 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* cmpl-double v5, v5, v13 */
/* if-nez v5, :cond_4 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* cmpl-double v5, v5, v11 */
/* if-nez v5, :cond_4 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* cmpl-double v5, v5, v11 */
/* if-nez v5, :cond_4 */
/* .line 282 */
int v4 = 0; // const/4 v4, 0x0
/* .line 283 */
/* goto/16 :goto_0 */
/* .line 294 */
/* .restart local v0 # "dx":D */
/* .restart local v2 # "dy":D */
} // :cond_a
/* cmpl-double v5, v0, v13 */
if ( v5 != null) { // if-eqz v5, :cond_6
/* .line 295 */
/* or-int/lit8 v4, v4, 0x2 */
/* .line 300 */
} // :cond_b
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* cmpl-double v5, v5, v11 */
/* if-nez v5, :cond_c */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* cmpl-double v5, v5, v11 */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 301 */
} // :cond_c
/* or-int/lit8 v4, v4, 0x10 */
/* goto/16 :goto_0 */
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1087 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).toString ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->toString()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // .end method
public com.wiyun.engine.types.WYAffineTransform inverse ( ) {
/* .locals 22 */
/* .prologue */
/* .line 740 */
/* invoke-virtual/range {p0 ..p0}, Lcom/wiyun/engine/types/WYAffineTransform;->getDeterminant()D */
/* move-result-wide v10 */
/* .line 741 */
/* .local v10, "det":D */
java.lang.Math .abs ( v10,v11 );
/* move-result-wide v16 */
/* const-wide v18, 0x3ddb7cdfd9d7bdbbL # 1.0E-10 */
/* cmpg-double v16, v16, v18 */
/* if-gez v16, :cond_0 */
/* .line 742 */
/* invoke-virtual/range {p0 ..p0}, Lcom/wiyun/engine/types/WYAffineTransform;->setToIdentity()V */
/* .line 744 */
} // :cond_0
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-wide/from16 v16, v0 */
/* div-double v2, v16, v10 */
/* .line 745 */
/* .local v2, "a1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-wide/from16 v16, v0 */
/* move-wide/from16 v0, v16 */
/* neg-double v0, v0 */
/* move-wide/from16 v16, v0 */
/* div-double v4, v16, v10 */
/* .line 746 */
/* .local v4, "b1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-wide/from16 v16, v0 */
/* move-wide/from16 v0, v16 */
/* neg-double v0, v0 */
/* move-wide/from16 v16, v0 */
/* div-double v6, v16, v10 */
/* .line 747 */
/* .local v6, "c1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-wide/from16 v16, v0 */
/* div-double v8, v16, v10 */
/* .line 748 */
/* .local v8, "d1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-wide/from16 v16, v0 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-wide/from16 v18, v0 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-wide/from16 v20, v0 */
/* mul-double v18, v18, v20 */
/* sub-double v16, v16, v18 */
/* div-double v12, v16, v10 */
/* .line 749 */
/* .local v12, "tx1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-wide/from16 v16, v0 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-wide/from16 v18, v0 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* move-wide/from16 v20, v0 */
/* mul-double v18, v18, v20 */
/* sub-double v16, v16, v18 */
/* div-double v14, v16, v10 */
/* .line 750 */
/* .local v14, "ty1":D */
/* move-object/from16 v0, p0 */
/* iput-wide v2, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 751 */
/* move-object/from16 v0, p0 */
/* iput-wide v4, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* .line 752 */
/* move-object/from16 v0, p0 */
/* iput-wide v6, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* .line 753 */
/* move-object/from16 v0, p0 */
/* iput-wide v8, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* .line 754 */
/* move-object/from16 v0, p0 */
/* iput-wide v12, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* .line 755 */
/* move-object/from16 v0, p0 */
/* iput-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* .line 756 */
} // .end method
public com.wiyun.engine.types.WYPoint inverseTransform ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 10 */
/* .param p1, "src" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "dst" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 998 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).getDeterminant ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->getDeterminant()D
/* move-result-wide v0 */
/* .line 999 */
/* .local v0, "det":D */
java.lang.Math .abs ( v0,v1 );
/* move-result-wide v6 */
/* const-wide v8, 0x3ddb7cdfd9d7bdbbL # 1.0E-10 */
/* cmpg-double v6, v6, v8 */
/* if-gez v6, :cond_0 */
/* .line 1000 */
/* new-instance v6, Ljava/lang/IllegalStateException; */
final String v7 = "Determinant is zero"; // const-string v7, "Determinant is zero"
/* invoke-direct {v6, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v6 */
/* .line 1003 */
} // :cond_0
/* if-nez p2, :cond_1 */
/* .line 1004 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 1007 */
} // :cond_1
/* iget v6, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* float-to-double v6, v6 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* sub-double v2, v6, v8 */
/* .line 1008 */
/* .local v2, "x":D */
/* iget v6, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* float-to-double v6, v6 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* sub-double v4, v6, v8 */
/* .line 1010 */
/* .local v4, "y":D */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v6, v2 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v8, v4 */
/* sub-double/2addr v6, v8 */
/* div-double/2addr v6, v0 */
/* double-to-float v6, v6 */
/* iput v6, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 1011 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v6, v4 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v8, v2 */
/* sub-double/2addr v6, v8 */
/* div-double/2addr v6, v0 */
/* double-to-float v6, v6 */
/* iput v6, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 1012 */
} // .end method
public void inverseTransform ( Double[] p0, Integer p1, Double[] p2, Integer p3, Integer p4 ) {
/* .locals 12 */
/* .param p1, "src" # [D */
/* .param p2, "srcOff" # I */
/* .param p3, "dst" # [D */
/* .param p4, "dstOff" # I */
/* .param p5, "length" # I */
/* .prologue */
/* .line 1036 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).getDeterminant ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->getDeterminant()D
/* move-result-wide v0 */
/* .line 1037 */
/* .local v0, "det":D */
java.lang.Math .abs ( v0,v1 );
/* move-result-wide v8 */
/* const-wide v10, 0x3ddb7cdfd9d7bdbbL # 1.0E-10 */
/* cmpg-double v8, v8, v10 */
/* if-gez v8, :cond_1 */
/* .line 1038 */
/* new-instance v8, Ljava/lang/IllegalStateException; */
final String v9 = "Determinant is zero"; // const-string v9, "Determinant is zero"
/* invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v8 */
/* .line 1042 */
} // .end local p2 # "srcOff":I
} // .end local p4 # "dstOff":I
/* .local v2, "dstOff":I */
/* .local v3, "srcOff":I */
} // :cond_0
/* add-int/lit8 p2, v3, 0x1 */
} // .end local v3 # "srcOff":I
/* .restart local p2 # "srcOff":I */
/* aget-wide v8, p1, v3 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* sub-double v4, v8, v10 */
/* .line 1043 */
/* .local v4, "x":D */
/* add-int/lit8 v3, p2, 0x1 */
} // .end local p2 # "srcOff":I
/* .restart local v3 # "srcOff":I */
/* aget-wide v8, p1, p2 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* sub-double v6, v8, v10 */
/* .line 1044 */
/* .local v6, "y":D */
/* add-int/lit8 p4, v2, 0x1 */
} // .end local v2 # "dstOff":I
/* .restart local p4 # "dstOff":I */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v8, v4 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v10, v6 */
/* sub-double/2addr v8, v10 */
/* div-double/2addr v8, v0 */
/* aput-wide v8, p3, v2 */
/* .line 1045 */
/* add-int/lit8 v2, p4, 0x1 */
} // .end local p4 # "dstOff":I
/* .restart local v2 # "dstOff":I */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v8, v6 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v10, v4 */
/* sub-double/2addr v8, v10 */
/* div-double/2addr v8, v0 */
/* aput-wide v8, p3, p4 */
/* .line 1041 */
} // .end local v4 # "x":D
} // .end local v6 # "y":D
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_0 */
/* .line 1047 */
return;
} // .end local v2 # "dstOff":I
} // .end local v3 # "srcOff":I
/* .restart local p2 # "srcOff":I */
/* .restart local p4 # "dstOff":I */
} // :cond_1
/* move/from16 v2, p4 */
} // .end local p4 # "dstOff":I
/* .restart local v2 # "dstOff":I */
/* move v3, p2 */
} // .end local p2 # "srcOff":I
/* .restart local v3 # "srcOff":I */
} // .end method
public Boolean isIdentity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 371 */
v0 = (( com.wiyun.engine.types.WYAffineTransform ) p0 ).getType ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->getType()I
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public com.wiyun.engine.types.WYAffineTransform preConcat ( com.wiyun.engine.types.WYAffineTransform p0 ) {
/* .locals 1 */
/* .param p1, "t" # Lcom/wiyun/engine/types/WYAffineTransform; */
/* .prologue */
/* .line 730 */
/* invoke-direct {p1, p0}, Lcom/wiyun/engine/types/WYAffineTransform;->multiply(Lcom/wiyun/engine/types/WYAffineTransform;)Lcom/wiyun/engine/types/WYAffineTransform; */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).setTransform ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/types/WYAffineTransform;->setTransform(Lcom/wiyun/engine/types/WYAffineTransform;)V
/* .line 731 */
} // .end method
public void rotate ( Double p0 ) {
/* .locals 20 */
/* .param p1, "angle" # D */
/* .prologue */
/* .line 665 */
/* invoke-static/range {p1 ..p2}, Ljava/lang/Math;->sin(D)D */
/* move-result-wide v12 */
/* .line 666 */
/* .local v12, "sin":D */
/* invoke-static/range {p1 ..p2}, Ljava/lang/Math;->cos(D)D */
/* move-result-wide v8 */
/* .line 667 */
/* .local v8, "cos":D */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v14, v8 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-wide/from16 v16, v0 */
/* neg-double v0, v12 */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* add-double v2, v14, v16 */
/* .line 668 */
/* .local v2, "a1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v14, v12 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-wide/from16 v16, v0 */
/* mul-double v16, v16, v8 */
/* add-double v4, v14, v16 */
/* .line 669 */
/* .local v4, "b1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v14, v8 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-wide/from16 v16, v0 */
/* neg-double v0, v12 */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* add-double v6, v14, v16 */
/* .line 670 */
/* .local v6, "c1":D */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v14, v12 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-wide/from16 v16, v0 */
/* mul-double v16, v16, v8 */
/* add-double v10, v14, v16 */
/* .line 671 */
/* .local v10, "d1":D */
/* move-object/from16 v0, p0 */
/* iput-wide v2, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 672 */
/* move-object/from16 v0, p0 */
/* iput-wide v4, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* .line 673 */
/* move-object/from16 v0, p0 */
/* iput-wide v6, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* .line 674 */
/* move-object/from16 v0, p0 */
/* iput-wide v10, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* .line 675 */
return;
} // .end method
public void rotate ( Double p0, Double p1, Double p2 ) {
/* .locals 1 */
/* .param p1, "angle" # D */
/* .param p3, "px" # D */
/* .param p5, "py" # D */
/* .prologue */
/* .line 686 */
/* invoke-static/range {p1 ..p6}, Lcom/wiyun/engine/types/WYAffineTransform;->makeRotate(DDD)Lcom/wiyun/engine/types/WYAffineTransform; */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).concat ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/types/WYAffineTransform;->concat(Lcom/wiyun/engine/types/WYAffineTransform;)Lcom/wiyun/engine/types/WYAffineTransform;
/* .line 687 */
return;
} // .end method
public void scale ( Double p0, Double p1 ) {
/* .locals 2 */
/* .param p1, "scx" # D */
/* .param p3, "scy" # D */
/* .prologue */
/* .line 645 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v0, p1 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 646 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v0, p3 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* .line 647 */
return;
} // .end method
public void setToIdentity ( ) {
/* .locals 2 */
/* .prologue */
/* .line 438 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 439 */
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 440 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* .line 441 */
return;
} // .end method
public void setToRotation ( Double p0 ) {
/* .locals 8 */
/* .param p1, "angle" # D */
/* .prologue */
/* .line 515 */
java.lang.Math .sin ( p1,p2 );
/* move-result-wide v2 */
/* .line 516 */
/* .local v2, "sin":D */
java.lang.Math .cos ( p1,p2 );
/* move-result-wide v0 */
/* .line 517 */
/* .local v0, "cos":D */
java.lang.Math .abs ( v0,v1 );
/* move-result-wide v4 */
/* const-wide v6, 0x3ddb7cdfd9d7bdbbL # 1.0E-10 */
/* cmpg-double v4, v4, v6 */
/* if-gez v4, :cond_2 */
/* .line 518 */
/* const-wide/16 v0, 0x0 */
/* .line 519 */
/* const-wide/16 v4, 0x0 */
/* cmpl-double v4, v2, v4 */
/* if-lez v4, :cond_1 */
/* const-wide/high16 v2, 0x3ff0000000000000L # 1.0 */
/* .line 524 */
} // :cond_0
} // :goto_0
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 525 */
/* neg-double v4, v2 */
/* iput-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* .line 526 */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* .line 527 */
/* const-wide/16 v4, 0x0 */
/* iput-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iput-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* .line 528 */
int v4 = -1; // const/4 v4, -0x1
/* iput v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 529 */
return;
/* .line 519 */
} // :cond_1
/* const-wide/high16 v2, -0x4010000000000000L # -1.0 */
/* .line 520 */
} // :cond_2
java.lang.Math .abs ( v2,v3 );
/* move-result-wide v4 */
/* const-wide v6, 0x3ddb7cdfd9d7bdbbL # 1.0E-10 */
/* cmpg-double v4, v4, v6 */
/* if-gez v4, :cond_0 */
/* .line 521 */
/* const-wide/16 v2, 0x0 */
/* .line 522 */
/* const-wide/16 v4, 0x0 */
/* cmpl-double v4, v0, v4 */
/* if-lez v4, :cond_3 */
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
} // :goto_1
} // :cond_3
/* const-wide/high16 v0, -0x4010000000000000L # -1.0 */
} // .end method
public void setToRotation ( Double p0, Double p1, Double p2 ) {
/* .locals 6 */
/* .param p1, "angle" # D */
/* .param p3, "px" # D */
/* .param p5, "py" # D */
/* .prologue */
/* const-wide/high16 v4, 0x3ff0000000000000L # 1.0 */
/* .line 540 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).setToRotation ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/wiyun/engine/types/WYAffineTransform;->setToRotation(D)V
/* .line 541 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* sub-double v0, v4, v0 */
/* mul-double/2addr v0, p3 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v2, p5 */
/* add-double/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* .line 542 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* sub-double v0, v4, v0 */
/* mul-double/2addr v0, p5 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v2, p3 */
/* sub-double/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* .line 543 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 544 */
return;
} // .end method
public void setToScale ( Double p0, Double p1 ) {
/* .locals 4 */
/* .param p1, "scx" # D */
/* .param p3, "scy" # D */
/* .prologue */
/* const-wide/high16 v2, 0x3ff0000000000000L # 1.0 */
/* .line 475 */
/* iput-wide p1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 476 */
/* iput-wide p3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* .line 477 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* .line 478 */
/* cmpl-double v0, p1, v2 */
/* if-nez v0, :cond_0 */
/* cmpl-double v0, p3, v2 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 479 */
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 483 */
} // :goto_0
return;
/* .line 481 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // .end method
public void setToShear ( Double p0, Double p1 ) {
/* .locals 4 */
/* .param p1, "shx" # D */
/* .param p3, "shy" # D */
/* .prologue */
/* const-wide/16 v2, 0x0 */
/* .line 495 */
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 496 */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* .line 497 */
/* iput-wide p1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* .line 498 */
/* iput-wide p3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* .line 499 */
/* cmpl-double v0, p1, v2 */
/* if-nez v0, :cond_0 */
/* cmpl-double v0, p3, v2 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 500 */
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 504 */
} // :goto_0
return;
/* .line 502 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // .end method
public void setToTranslation ( Double p0, Double p1 ) {
/* .locals 4 */
/* .param p1, "mx" # D */
/* .param p3, "my" # D */
/* .prologue */
/* const-wide/16 v2, 0x0 */
/* .line 454 */
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 455 */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* .line 456 */
/* iput-wide p1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* .line 457 */
/* iput-wide p3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* .line 458 */
/* cmpl-double v0, p1, v2 */
/* if-nez v0, :cond_0 */
/* cmpl-double v0, p3, v2 */
/* if-nez v0, :cond_0 */
/* .line 459 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 463 */
} // :goto_0
return;
/* .line 461 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // .end method
public void setTransform ( Double p0, Double p1, Double p2, Double p3, Double p4, Double p5 ) {
/* .locals 1 */
/* .param p1, "m00" # D */
/* .param p3, "m10" # D */
/* .param p5, "m01" # D */
/* .param p7, "m11" # D */
/* .param p9, "m02" # D */
/* .param p11, "m12" # D */
/* .prologue */
/* .line 414 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 415 */
/* iput-wide p1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* .line 416 */
/* iput-wide p3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* .line 417 */
/* iput-wide p5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* .line 418 */
/* iput-wide p7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* .line 419 */
/* iput-wide p9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* .line 420 */
/* iput-wide p11, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* .line 421 */
return;
} // .end method
public void setTransform ( com.wiyun.engine.types.WYAffineTransform p0 ) {
/* .locals 13 */
/* .param p1, "t" # Lcom/wiyun/engine/types/WYAffineTransform; */
/* .prologue */
/* .line 430 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* .line 431 */
/* iget-wide v1, p1, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v3, p1, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iget-wide v5, p1, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iget-wide v7, p1, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iget-wide v9, p1, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iget-wide v11, p1, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* move-object v0, p0 */
/* invoke-virtual/range {v0 ..v12}, Lcom/wiyun/engine/types/WYAffineTransform;->setTransform(DDDDDD)V */
/* .line 432 */
return;
} // .end method
public void shear ( Double p0, Double p1 ) {
/* .locals 1 */
/* .param p1, "shx" # D */
/* .param p3, "shy" # D */
/* .prologue */
/* .line 656 */
com.wiyun.engine.types.WYAffineTransform .makeShear ( p1,p2,p3,p4 );
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).concat ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/types/WYAffineTransform;->concat(Lcom/wiyun/engine/types/WYAffineTransform;)Lcom/wiyun/engine/types/WYAffineTransform;
/* .line 657 */
return;
} // .end method
public void toGL ( Float[] p0 ) {
/* .locals 9 */
/* .param p1, "m" # [F */
/* .prologue */
/* .line 1138 */
int v0 = 2; // const/4 v0, 0x2
int v1 = 3; // const/4 v1, 0x3
int v2 = 6; // const/4 v2, 0x6
int v3 = 7; // const/4 v3, 0x7
/* const/16 v4, 0x8 */
/* const/16 v5, 0x9 */
/* const/16 v6, 0xb */
/* const/16 v7, 0xe */
int v8 = 0; // const/4 v8, 0x0
/* aput v8, p1, v7 */
/* aput v8, p1, v6 */
/* aput v8, p1, v5 */
/* aput v8, p1, v4 */
/* aput v8, p1, v3 */
/* aput v8, p1, v2 */
/* aput v8, p1, v1 */
/* aput v8, p1, v0 */
/* .line 1139 */
/* const/16 v0, 0xa */
/* const/16 v1, 0xf */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, p1, v1 */
/* aput v2, p1, v0 */
/* .line 1140 */
int v0 = 0; // const/4 v0, 0x0
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
/* .line 1141 */
int v0 = 4; // const/4 v0, 0x4
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
/* .line 1142 */
/* const/16 v0, 0xc */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
/* .line 1143 */
int v0 = 1; // const/4 v0, 0x1
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
/* .line 1144 */
int v0 = 5; // const/4 v0, 0x5
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
/* .line 1145 */
/* const/16 v0, 0xd */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
/* .line 1146 */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1051 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 1052 */
/* .local v0, "sb":Ljava/lang/StringBuilder; */
final String v1 = "[["; // const-string v1, "[["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 1053 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* .line 1054 */
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 1055 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* .line 1056 */
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 1057 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* .line 1058 */
final String v2 = "], ["; // const-string v2, "], ["
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 1059 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* .line 1060 */
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 1061 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* .line 1062 */
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 1063 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* .line 1064 */
final String v2 = "]]"; // const-string v2, "]]"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 1065 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public com.wiyun.engine.types.WYPoint transform ( Float p0, Float p1 ) {
/* .locals 7 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 760 */
com.wiyun.engine.types.WYPoint .make ( v1,v1 );
/* .line 761 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* float-to-double v1, p1 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v1, v3 */
/* float-to-double v3, p2 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v3, v5 */
/* add-double/2addr v1, v3 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v1, v3 */
/* double-to-float v1, v1 */
/* iput v1, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 762 */
/* float-to-double v1, p1 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v1, v3 */
/* float-to-double v3, p2 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v3, v5 */
/* add-double/2addr v1, v3 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v1, v3 */
/* double-to-float v1, v1 */
/* iput v1, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 763 */
} // .end method
public com.wiyun.engine.types.WYPoint transform ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 8 */
/* .param p1, "src" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 774 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 775 */
/* .local v0, "x":F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 777 */
/* .local v1, "y":F */
/* float-to-double v2, v0 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v2, v4 */
/* float-to-double v4, v1 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v4, v6 */
/* add-double/2addr v2, v4 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v2, v4 */
/* double-to-float v2, v2 */
/* iput v2, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 778 */
/* float-to-double v2, v0 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v2, v4 */
/* float-to-double v4, v1 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v4, v6 */
/* add-double/2addr v2, v4 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v2, v4 */
/* double-to-float v2, v2 */
/* iput v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 779 */
} // .end method
public void transform ( Double[] p0, Integer p1, Double[] p2, Integer p3, Integer p4 ) {
/* .locals 10 */
/* .param p1, "src" # [D */
/* .param p2, "srcOff" # I */
/* .param p3, "dst" # [D */
/* .param p4, "dstOff" # I */
/* .param p5, "length" # I */
/* .prologue */
/* .line 829 */
int v0 = 2; // const/4 v0, 0x2
/* .line 830 */
/* .local v0, "step":I */
/* if-ne p1, p3, :cond_0 */
/* if-ge p2, p4, :cond_0 */
/* mul-int/lit8 v5, p5, 0x2 */
/* add-int/2addr v5, p2 */
/* if-ge p4, v5, :cond_0 */
/* .line 831 */
/* mul-int/lit8 v5, p5, 0x2 */
/* add-int/2addr v5, p2 */
/* add-int/lit8 p2, v5, -0x2 */
/* .line 832 */
/* mul-int/lit8 v5, p5, 0x2 */
/* add-int/2addr v5, p4 */
/* add-int/lit8 p4, v5, -0x2 */
/* .line 833 */
int v0 = -2; // const/4 v0, -0x2
/* .line 835 */
} // :cond_0
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_1 */
/* .line 843 */
return;
/* .line 836 */
} // :cond_1
/* add-int/lit8 v5, p2, 0x0 */
/* aget-wide v1, p1, v5 */
/* .line 837 */
/* .local v1, "x":D */
/* add-int/lit8 v5, p2, 0x1 */
/* aget-wide v3, p1, v5 */
/* .line 838 */
/* .local v3, "y":D */
/* add-int/lit8 v5, p4, 0x0 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v6, v1 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v8, v3 */
/* add-double/2addr v6, v8 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v6, v8 */
/* aput-wide v6, p3, v5 */
/* .line 839 */
/* add-int/lit8 v5, p4, 0x1 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v6, v1 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v8, v3 */
/* add-double/2addr v6, v8 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v6, v8 */
/* aput-wide v6, p3, v5 */
/* .line 840 */
/* add-int/2addr p2, v0 */
/* .line 841 */
/* add-int/2addr p4, v0 */
} // .end method
public void transform ( Double[] p0, Integer p1, Float[] p2, Integer p3, Integer p4 ) {
/* .locals 10 */
/* .param p1, "src" # [D */
/* .param p2, "srcOff" # I */
/* .param p3, "dst" # [F */
/* .param p4, "dstOff" # I */
/* .param p5, "length" # I */
/* .prologue */
/* .line 925 */
/* move v0, p4 */
} // .end local p4 # "dstOff":I
/* .local v0, "dstOff":I */
/* move v1, p2 */
} // .end local p2 # "srcOff":I
/* .local v1, "srcOff":I */
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_0 */
/* .line 931 */
return;
/* .line 926 */
} // :cond_0
/* add-int/lit8 p2, v1, 0x1 */
} // .end local v1 # "srcOff":I
/* .restart local p2 # "srcOff":I */
/* aget-wide v2, p1, v1 */
/* .line 927 */
/* .local v2, "x":D */
/* add-int/lit8 v1, p2, 0x1 */
} // .end local p2 # "srcOff":I
/* .restart local v1 # "srcOff":I */
/* aget-wide v4, p1, p2 */
/* .line 928 */
/* .local v4, "y":D */
/* add-int/lit8 p4, v0, 0x1 */
} // .end local v0 # "dstOff":I
/* .restart local p4 # "dstOff":I */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v6, v2 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v8, v4 */
/* add-double/2addr v6, v8 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v6, v8 */
/* double-to-float v6, v6 */
/* aput v6, p3, v0 */
/* .line 929 */
/* add-int/lit8 v0, p4, 0x1 */
} // .end local p4 # "dstOff":I
/* .restart local v0 # "dstOff":I */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v6, v2 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v8, v4 */
/* add-double/2addr v6, v8 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v6, v8 */
/* double-to-float v6, v6 */
/* aput v6, p3, p4 */
} // .end method
public void transform ( Float[] p0, Integer p1, Double[] p2, Integer p3, Integer p4 ) {
/* .locals 10 */
/* .param p1, "src" # [F */
/* .param p2, "srcOff" # I */
/* .param p3, "dst" # [D */
/* .param p4, "dstOff" # I */
/* .param p5, "length" # I */
/* .prologue */
/* .line 898 */
/* move v0, p4 */
} // .end local p4 # "dstOff":I
/* .local v0, "dstOff":I */
/* move v1, p2 */
} // .end local p2 # "srcOff":I
/* .local v1, "srcOff":I */
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_0 */
/* .line 904 */
return;
/* .line 899 */
} // :cond_0
/* add-int/lit8 p2, v1, 0x1 */
} // .end local v1 # "srcOff":I
/* .restart local p2 # "srcOff":I */
/* aget v2, p1, v1 */
/* .line 900 */
/* .local v2, "x":F */
/* add-int/lit8 v1, p2, 0x1 */
} // .end local p2 # "srcOff":I
/* .restart local v1 # "srcOff":I */
/* aget v3, p1, p2 */
/* .line 901 */
/* .local v3, "y":F */
/* add-int/lit8 p4, v0, 0x1 */
} // .end local v0 # "dstOff":I
/* .restart local p4 # "dstOff":I */
/* float-to-double v4, v2 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v4, v6 */
/* float-to-double v6, v3 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v6, v8 */
/* add-double/2addr v4, v6 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v4, v6 */
/* aput-wide v4, p3, v0 */
/* .line 902 */
/* add-int/lit8 v0, p4, 0x1 */
} // .end local p4 # "dstOff":I
/* .restart local v0 # "dstOff":I */
/* float-to-double v4, v2 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v4, v6 */
/* float-to-double v6, v3 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v6, v8 */
/* add-double/2addr v4, v6 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v4, v6 */
/* aput-wide v4, p3, p4 */
} // .end method
public void transform ( Float[] p0, Integer p1, Float[] p2, Integer p3, Integer p4 ) {
/* .locals 10 */
/* .param p1, "src" # [F */
/* .param p2, "srcOff" # I */
/* .param p3, "dst" # [F */
/* .param p4, "dstOff" # I */
/* .param p5, "length" # I */
/* .prologue */
/* .line 863 */
int v0 = 2; // const/4 v0, 0x2
/* .line 864 */
/* .local v0, "step":I */
/* if-ne p1, p3, :cond_0 */
/* if-ge p2, p4, :cond_0 */
/* mul-int/lit8 v5, p5, 0x2 */
/* add-int/2addr v5, p2 */
/* if-ge p4, v5, :cond_0 */
/* .line 865 */
/* mul-int/lit8 v5, p5, 0x2 */
/* add-int/2addr v5, p2 */
/* add-int/lit8 p2, v5, -0x2 */
/* .line 866 */
/* mul-int/lit8 v5, p5, 0x2 */
/* add-int/2addr v5, p4 */
/* add-int/lit8 p4, v5, -0x2 */
/* .line 867 */
int v0 = -2; // const/4 v0, -0x2
/* .line 869 */
} // :cond_0
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_1 */
/* .line 877 */
return;
/* .line 870 */
} // :cond_1
/* add-int/lit8 v5, p2, 0x0 */
/* aget v5, p1, v5 */
/* float-to-double v1, v5 */
/* .line 871 */
/* .local v1, "x":D */
/* add-int/lit8 v5, p2, 0x1 */
/* aget v5, p1, v5 */
/* float-to-double v3, v5 */
/* .line 872 */
/* .local v3, "y":D */
/* add-int/lit8 v5, p4, 0x0 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v6, v1 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v8, v3 */
/* add-double/2addr v6, v8 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v6, v8 */
/* double-to-float v6, v6 */
/* aput v6, p3, v5 */
/* .line 873 */
/* add-int/lit8 v5, p4, 0x1 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v6, v1 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v8, v3 */
/* add-double/2addr v6, v8 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v6, v8 */
/* double-to-float v6, v6 */
/* aput v6, p3, v5 */
/* .line 874 */
/* add-int/2addr p2, v0 */
/* .line 875 */
/* add-int/2addr p4, v0 */
} // .end method
public void transform ( com.wiyun.engine.types.WYPoint[] p0, Integer p1, com.wiyun.engine.types.WYPoint[] p2, Integer p3, Integer p4 ) {
/* .locals 12 */
/* .param p1, "src" # [Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "srcOff" # I */
/* .param p3, "dst" # [Lcom/wiyun/engine/types/WYPoint; */
/* .param p4, "dstOff" # I */
/* .param p5, "length" # I */
/* .prologue */
/* .line 797 */
/* move/from16 v0, p4 */
} // .end local p4 # "dstOff":I
/* .local v0, "dstOff":I */
/* move v2, p2 */
} // .end local p2 # "srcOff":I
/* .local v2, "srcOff":I */
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_0 */
/* .line 809 */
return;
/* .line 798 */
} // :cond_0
/* add-int/lit8 p2, v2, 0x1 */
} // .end local v2 # "srcOff":I
/* .restart local p2 # "srcOff":I */
/* aget-object v3, p1, v2 */
/* .line 799 */
/* .local v3, "srcPoint":Lcom/wiyun/engine/types/WYPoint; */
/* iget v8, v3, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* float-to-double v4, v8 */
/* .line 800 */
/* .local v4, "x":D */
/* iget v8, v3, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* float-to-double v6, v8 */
/* .line 801 */
/* .local v6, "y":D */
/* aget-object v1, p3, v0 */
/* .line 802 */
/* .local v1, "dstPoint":Lcom/wiyun/engine/types/WYPoint; */
/* if-nez v1, :cond_1 */
/* .line 803 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 805 */
} // :cond_1
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v8, v4 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v10, v6 */
/* add-double/2addr v8, v10 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v8, v10 */
/* double-to-float v8, v8 */
/* iput v8, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 806 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v8, v4 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v10, v6 */
/* add-double/2addr v8, v10 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v8, v10 */
/* double-to-float v8, v8 */
/* iput v8, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 807 */
/* add-int/lit8 p4, v0, 0x1 */
} // .end local v0 # "dstOff":I
/* .restart local p4 # "dstOff":I */
/* aput-object v1, p3, v0 */
/* move/from16 v0, p4 */
} // .end local p4 # "dstOff":I
/* .restart local v0 # "dstOff":I */
/* move v2, p2 */
} // .end local p2 # "srcOff":I
/* .restart local v2 # "srcOff":I */
} // .end method
public void translate ( Double p0, Double p1 ) {
/* .locals 8 */
/* .param p1, "mx" # D */
/* .param p3, "my" # D */
/* .prologue */
/* .line 632 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v4, p1 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v6, p3 */
/* add-double/2addr v4, v6 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double v0, v4, v6 */
/* .line 633 */
/* .local v0, "tx1":D */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v4, p1 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v6, p3 */
/* add-double/2addr v4, v6 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double v2, v4, v6 */
/* .line 634 */
/* .local v2, "ty1":D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* .line 635 */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* .line 636 */
return;
} // .end method

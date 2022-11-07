public class com.wiyun.engine.types.WYAffineTransform implements com.wiyun.engine.types.ICopyable implements java.io.Serializable implements java.lang.Cloneable {
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
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYAffineTransform ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* iput-wide p1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* iput-wide p3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 /* iput-wide p5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* iput-wide p7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* iput-wide p9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* iput-wide p11, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYAffineTransform ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* float-to-double v0, p1 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* float-to-double v0, p2 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 /* float-to-double v0, p3 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* float-to-double v0, p4 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* float-to-double v0, p5 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* float-to-double v0, p6 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYAffineTransform ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 /* iget-wide v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYAffineTransform ( ) {
		 /* .locals 3 */
		 int v2 = 4; // const/4 v2, 0x4
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* aget-wide v0, p1, v0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
		 int v0 = 1; // const/4 v0, 0x1
		 /* aget-wide v0, p1, v0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
		 int v0 = 2; // const/4 v0, 0x2
		 /* aget-wide v0, p1, v0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
		 int v0 = 3; // const/4 v0, 0x3
		 /* aget-wide v0, p1, v0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
		 /* array-length v0, p1 */
		 /* if-le v0, v2, :cond_0 */
		 /* aget-wide v0, p1, v2 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
		 int v0 = 5; // const/4 v0, 0x5
		 /* aget-wide v0, p1, v0 */
		 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
	 } // :cond_0
	 return;
} // .end method
public com.wiyun.engine.types.WYAffineTransform ( ) {
	 /* .locals 3 */
	 int v2 = 4; // const/4 v2, 0x4
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
	 int v0 = 0; // const/4 v0, 0x0
	 /* aget v0, p1, v0 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
	 int v0 = 1; // const/4 v0, 0x1
	 /* aget v0, p1, v0 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
	 int v0 = 2; // const/4 v0, 0x2
	 /* aget v0, p1, v0 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
	 int v0 = 3; // const/4 v0, 0x3
	 /* aget v0, p1, v0 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
	 /* array-length v0, p1 */
	 /* if-le v0, v2, :cond_0 */
	 /* aget v0, p1, v2 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
	 int v0 = 5; // const/4 v0, 0x5
	 /* aget v0, p1, v0 */
	 /* float-to-double v0, v0 */
	 /* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
} // :cond_0
return;
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeIdentity ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeRotate ( Double p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
(( com.wiyun.engine.types.WYAffineTransform ) v0 ).setToRotation ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/wiyun/engine/types/WYAffineTransform;->setToRotation(D)V
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeRotate ( Double p0, Double p1, Double p2 ) {
/* .locals 7 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
/* move-wide v1, p0 */
/* move-wide v3, p2 */
/* move-wide v5, p4 */
/* invoke-virtual/range {v0 ..v6}, Lcom/wiyun/engine/types/WYAffineTransform;->setToRotation(DDD)V */
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeScale ( Double p0, Double p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
(( com.wiyun.engine.types.WYAffineTransform ) v0 ).setToScale ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/types/WYAffineTransform;->setToScale(DD)V
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeShear ( Double p0, Double p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
(( com.wiyun.engine.types.WYAffineTransform ) v0 ).setToShear ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/types/WYAffineTransform;->setToShear(DD)V
} // .end method
public static com.wiyun.engine.types.WYAffineTransform makeTranslate ( Double p0, Double p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
(( com.wiyun.engine.types.WYAffineTransform ) v0 ).setToTranslation ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/types/WYAffineTransform;->setToTranslation(DD)V
} // .end method
private com.wiyun.engine.types.WYAffineTransform multiply ( com.wiyun.engine.types.WYAffineTransform p0 ) {
/* .locals 17 */
/* move-object/from16 v0, p0 */
/* iget-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-object/from16 v0, p1 */
/* iget-wide v3, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v1, v3 */
/* move-object/from16 v0, p0 */
/* iget-wide v3, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-object/from16 v0, p1 */
/* iget-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v3, v5 */
/* add-double/2addr v1, v3 */
/* move-object/from16 v0, p0 */
/* iget-wide v3, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-object/from16 v0, p1 */
/* iget-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v3, v5 */
/* move-object/from16 v0, p0 */
/* iget-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-object/from16 v0, p1 */
/* iget-wide v7, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v5, v7 */
/* add-double/2addr v3, v5 */
/* move-object/from16 v0, p0 */
/* iget-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-object/from16 v0, p1 */
/* iget-wide v7, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v5, v7 */
/* move-object/from16 v0, p0 */
/* iget-wide v7, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-object/from16 v0, p1 */
/* iget-wide v9, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v7, v9 */
/* add-double/2addr v5, v7 */
/* move-object/from16 v0, p0 */
/* iget-wide v7, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-object/from16 v0, p1 */
/* iget-wide v9, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v7, v9 */
/* move-object/from16 v0, p0 */
/* iget-wide v9, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-object/from16 v0, p1 */
/* iget-wide v11, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v9, v11 */
/* add-double/2addr v7, v9 */
/* move-object/from16 v0, p0 */
/* iget-wide v9, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-object/from16 v0, p1 */
/* iget-wide v11, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v9, v11 */
/* move-object/from16 v0, p0 */
/* iget-wide v11, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* move-object/from16 v0, p1 */
/* iget-wide v13, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v11, v13 */
/* add-double/2addr v9, v11 */
/* move-object/from16 v0, p1 */
/* iget-wide v11, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v9, v11 */
/* move-object/from16 v0, p0 */
/* iget-wide v11, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-object/from16 v0, p1 */
/* iget-wide v13, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v11, v13 */
/* move-object/from16 v0, p0 */
/* iget-wide v13, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* move-object/from16 v0, p1 */
/* iget-wide v15, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v13, v15 */
/* add-double/2addr v11, v13 */
/* move-object/from16 v0, p1 */
/* iget-wide v13, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v11, v13 */
/* move-object/from16 v0, p0 */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-object/from16 v0, p0 */
/* iput-wide v3, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-object/from16 v0, p0 */
/* iput-wide v5, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-object/from16 v0, p0 */
/* iput-wide v7, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-object/from16 v0, p0 */
/* iput-wide v9, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-object/from16 v0, p0 */
/* iput-wide v11, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
} // .end method
private void readObject ( java.io.ObjectInputStream p0 ) {
/* .locals 1 */
(( java.io.ObjectInputStream ) p1 ).defaultReadObject ( ); // invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
return;
} // .end method
private void writeObject ( java.io.ObjectOutputStream p0 ) {
/* .locals 0 */
(( java.io.ObjectOutputStream ) p1 ).defaultWriteObject ( ); // invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V
return;
} // .end method
/* # virtual methods */
public java.lang.Object clone ( ) {
/* .locals 1 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->copy()Lcom/wiyun/engine/types/WYAffineTransform;
} // .end method
public com.wiyun.engine.types.WYAffineTransform concat ( com.wiyun.engine.types.WYAffineTransform p0 ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/types/WYAffineTransform;->multiply(Lcom/wiyun/engine/types/WYAffineTransform;)Lcom/wiyun/engine/types/WYAffineTransform; */
} // .end method
public com.wiyun.engine.types.WYAffineTransform copy ( ) {
/* .locals 3 */
/* new-instance v0, Lcom/wiyun/engine/types/WYAffineTransform; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYAffineTransform;-><init>()V */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iput-wide v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iget v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* iput v1, v0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->copy()Lcom/wiyun/engine/types/WYAffineTransform;
} // .end method
public com.wiyun.engine.types.WYPoint deltaTransform ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 8 */
/* if-nez p2, :cond_0 */
com.wiyun.engine.types.WYPoint .makeZero ( );
} // :cond_0
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* float-to-double v0, v0 */
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* float-to-double v2, v2 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v4, v0 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v6, v2 */
/* add-double/2addr v4, v6 */
/* double-to-float v4, v4 */
/* iput v4, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v0, v4 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v2, v4 */
/* add-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iput v0, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
} // .end method
public void deltaTransform ( Double[] p0, Integer p1, Double[] p2, Integer p3, Integer p4 ) {
/* .locals 9 */
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_0 */
return;
} // :cond_0
/* add-int/lit8 v0, p2, 0x1 */
/* aget-wide v1, p1, p2 */
/* add-int/lit8 p2, v0, 0x1 */
/* aget-wide v3, p1, v0 */
/* add-int/lit8 v0, p4, 0x1 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v5, v1 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v7, v3 */
/* add-double/2addr v5, v7 */
/* aput-wide v5, p3, p4 */
/* add-int/lit8 p4, v0, 0x1 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v1, v5 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v3, v5 */
/* add-double/2addr v1, v3 */
/* aput-wide v1, p3, v0 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 6 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* if-ne p1, p0, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
/* instance-of v2, p1, Lcom/wiyun/engine/types/WYAffineTransform; */
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast p1, Lcom/wiyun/engine/types/WYAffineTransform; */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v4, p1, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* cmpl-double v2, v2, v4 */
/* if-nez v2, :cond_2 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iget-wide v4, p1, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* cmpl-double v2, v2, v4 */
/* if-nez v2, :cond_2 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iget-wide v4, p1, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* cmpl-double v2, v2, v4 */
/* if-nez v2, :cond_2 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iget-wide v4, p1, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* cmpl-double v2, v2, v4 */
/* if-nez v2, :cond_2 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iget-wide v4, p1, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* cmpl-double v2, v2, v4 */
/* if-nez v2, :cond_2 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iget-wide v4, p1, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* cmpl-double v2, v2, v4 */
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_2
/* move v0, v1 */
} // :cond_3
/* move v0, v1 */
} // .end method
public void fromGL ( Float[] p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
int v0 = 4; // const/4 v0, 0x4
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* const/16 v0, 0xc */
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
int v0 = 1; // const/4 v0, 0x1
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
int v0 = 5; // const/4 v0, 0x5
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* const/16 v0, 0xd */
/* aget v0, p1, v0 */
/* float-to-double v0, v0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
return;
} // .end method
public Double getDeterminant ( ) {
/* .locals 6 */
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
int v3 = 4; // const/4 v3, 0x4
int v0 = 0; // const/4 v0, 0x0
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* aput-wide v1, p1, v0 */
int v0 = 1; // const/4 v0, 0x1
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* aput-wide v1, p1, v0 */
int v0 = 2; // const/4 v0, 0x2
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* aput-wide v1, p1, v0 */
int v0 = 3; // const/4 v0, 0x3
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* aput-wide v1, p1, v0 */
/* array-length v0, p1 */
/* if-le v0, v3, :cond_0 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* aput-wide v0, p1, v3 */
int v0 = 5; // const/4 v0, 0x5
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* aput-wide v1, p1, v0 */
} // :cond_0
return;
} // .end method
public Double getScaleX ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* return-wide v0 */
} // .end method
public Double getScaleY ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* return-wide v0 */
} // .end method
public Double getShearX ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* return-wide v0 */
} // .end method
public Double getShearY ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* return-wide v0 */
} // .end method
public Double getTranslateX ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* return-wide v0 */
} // .end method
public Double getTranslateY ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* return-wide v0 */
} // .end method
public Integer getType ( ) {
/* .locals 13 */
int v0 = 0; // const/4 v0, 0x0
/* const-wide/high16 v11, 0x3ff0000000000000L # 1.0 */
/* const-wide/16 v9, 0x0 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_1 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // :cond_0
} // :goto_0
} // :cond_1
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v1, v3 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v3, v5 */
/* add-double/2addr v1, v3 */
/* cmpl-double v1, v1, v9 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* const/16 v0, 0x20 */
} // :cond_2
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* cmpl-double v1, v1, v9 */
/* if-nez v1, :cond_3 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* cmpl-double v1, v1, v9 */
if ( v1 != null) { // if-eqz v1, :cond_9
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
} // :cond_4
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v1, v3 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v3, v5 */
/* sub-double/2addr v1, v3 */
/* cmpg-double v1, v1, v9 */
/* if-gez v1, :cond_5 */
/* or-int/lit8 v0, v0, 0x40 */
} // :cond_5
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v1, v3 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v3, v5 */
/* add-double/2addr v1, v3 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v3, v5 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v5, v7 */
/* add-double/2addr v3, v5 */
/* cmpl-double v3, v1, v3 */
if ( v3 != null) { // if-eqz v3, :cond_a
/* or-int/lit8 v0, v0, 0x4 */
} // :cond_6
} // :goto_1
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* cmpl-double v1, v1, v9 */
/* if-nez v1, :cond_7 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* cmpl-double v1, v1, v9 */
if ( v1 != null) { // if-eqz v1, :cond_8
} // :cond_7
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* cmpl-double v1, v1, v9 */
/* if-nez v1, :cond_b */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* cmpl-double v1, v1, v9 */
/* if-nez v1, :cond_b */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* cmpg-double v1, v1, v9 */
/* if-ltz v1, :cond_8 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* cmpg-double v1, v1, v9 */
/* if-gez v1, :cond_b */
} // :cond_8
/* or-int/lit8 v0, v0, 0x8 */
} // :cond_9
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* cmpl-double v1, v1, v11 */
/* if-nez v1, :cond_4 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* cmpl-double v1, v1, v11 */
/* if-nez v1, :cond_4 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* cmpl-double v1, v1, v9 */
/* if-nez v1, :cond_4 */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* cmpl-double v1, v1, v9 */
/* if-nez v1, :cond_4 */
/* goto/16 :goto_0 */
} // :cond_a
/* cmpl-double v1, v1, v11 */
if ( v1 != null) { // if-eqz v1, :cond_6
/* or-int/lit8 v0, v0, 0x2 */
} // :cond_b
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* cmpl-double v1, v1, v9 */
/* if-nez v1, :cond_c */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* cmpl-double v1, v1, v9 */
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_c
/* or-int/lit8 v0, v0, 0x10 */
/* goto/16 :goto_0 */
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).toString ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->toString()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // .end method
public com.wiyun.engine.types.WYAffineTransform inverse ( ) {
/* .locals 20 */
/* invoke-virtual/range {p0 ..p0}, Lcom/wiyun/engine/types/WYAffineTransform;->getDeterminant()D */
/* move-result-wide v2 */
java.lang.Math .abs ( v2,v3 );
/* move-result-wide v4 */
/* const-wide v6, 0x3ddb7cdfd9d7bdbbL # 1.0E-10 */
/* cmpg-double v4, v4, v6 */
/* if-gez v4, :cond_0 */
/* invoke-virtual/range {p0 ..p0}, Lcom/wiyun/engine/types/WYAffineTransform;->setToIdentity()V */
} // :cond_0
/* move-object/from16 v0, p0 */
/* iget-wide v4, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* div-double/2addr v4, v2 */
/* move-object/from16 v0, p0 */
/* iget-wide v6, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* neg-double v6, v6 */
/* div-double/2addr v6, v2 */
/* move-object/from16 v0, p0 */
/* iget-wide v8, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* neg-double v8, v8 */
/* div-double/2addr v8, v2 */
/* move-object/from16 v0, p0 */
/* iget-wide v10, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* div-double/2addr v10, v2 */
/* move-object/from16 v0, p0 */
/* iget-wide v12, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* mul-double/2addr v12, v14 */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-wide/from16 v16, v0 */
/* mul-double v14, v14, v16 */
/* sub-double/2addr v12, v14 */
/* div-double/2addr v12, v2 */
/* move-object/from16 v0, p0 */
/* iget-wide v14, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-wide/from16 v16, v0 */
/* mul-double v14, v14, v16 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-wide/from16 v16, v0 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* move-wide/from16 v18, v0 */
/* mul-double v16, v16, v18 */
/* sub-double v14, v14, v16 */
/* div-double v2, v14, v2 */
/* move-object/from16 v0, p0 */
/* iput-wide v4, v0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* move-object/from16 v0, p0 */
/* iput-wide v6, v0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* move-object/from16 v0, p0 */
/* iput-wide v8, v0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* move-object/from16 v0, p0 */
/* iput-wide v10, v0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* move-object/from16 v0, p0 */
/* iput-wide v12, v0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* move-object/from16 v0, p0 */
/* iput-wide v2, v0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
} // .end method
public com.wiyun.engine.types.WYPoint inverseTransform ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 10 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).getDeterminant ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->getDeterminant()D
/* move-result-wide v0 */
java.lang.Math .abs ( v0,v1 );
/* move-result-wide v2 */
/* const-wide v4, 0x3ddb7cdfd9d7bdbbL # 1.0E-10 */
/* cmpg-double v2, v2, v4 */
/* if-gez v2, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Determinant is zero"; // const-string v1, "Determinant is zero"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* if-nez p2, :cond_1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
} // :cond_1
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* float-to-double v2, v2 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* sub-double/2addr v2, v4 */
/* iget v4, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* float-to-double v4, v4 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* sub-double/2addr v4, v6 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v6, v2 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v8, v4 */
/* sub-double/2addr v6, v8 */
/* div-double/2addr v6, v0 */
/* double-to-float v6, v6 */
/* iput v6, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v4, v6 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v2, v6 */
/* sub-double v2, v4, v2 */
/* div-double v0, v2, v0 */
/* double-to-float v0, v0 */
/* iput v0, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
} // .end method
public void inverseTransform ( Double[] p0, Integer p1, Double[] p2, Integer p3, Integer p4 ) {
/* .locals 11 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).getDeterminant ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->getDeterminant()D
/* move-result-wide v0 */
java.lang.Math .abs ( v0,v1 );
/* move-result-wide v2 */
/* const-wide v4, 0x3ddb7cdfd9d7bdbbL # 1.0E-10 */
/* cmpg-double v2, v2, v4 */
/* if-gez v2, :cond_1 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Determinant is zero"; // const-string v1, "Determinant is zero"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* add-int/lit8 v2, p2, 0x1 */
/* aget-wide v3, p1, p2 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* sub-double/2addr v3, v5 */
/* add-int/lit8 p2, v2, 0x1 */
/* aget-wide v5, p1, v2 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* sub-double/2addr v5, v7 */
/* add-int/lit8 v2, p4, 0x1 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v7, v3 */
/* iget-wide v9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v9, v5 */
/* sub-double/2addr v7, v9 */
/* div-double/2addr v7, v0 */
/* aput-wide v7, p3, p4 */
/* add-int/lit8 p4, v2, 0x1 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v5, v7 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v3, v7 */
/* sub-double v3, v5, v3 */
/* div-double/2addr v3, v0 */
/* aput-wide v3, p3, v2 */
} // :cond_1
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_0 */
return;
} // .end method
public Boolean isIdentity ( ) {
/* .locals 1 */
v0 = (( com.wiyun.engine.types.WYAffineTransform ) p0 ).getType ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYAffineTransform;->getType()I
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public com.wiyun.engine.types.WYAffineTransform preConcat ( com.wiyun.engine.types.WYAffineTransform p0 ) {
/* .locals 1 */
/* invoke-direct {p1, p0}, Lcom/wiyun/engine/types/WYAffineTransform;->multiply(Lcom/wiyun/engine/types/WYAffineTransform;)Lcom/wiyun/engine/types/WYAffineTransform; */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).setTransform ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/types/WYAffineTransform;->setTransform(Lcom/wiyun/engine/types/WYAffineTransform;)V
} // .end method
public void rotate ( Double p0 ) {
/* .locals 14 */
/* invoke-static/range {p1 ..p2}, Ljava/lang/Math;->sin(D)D */
/* move-result-wide v0 */
/* invoke-static/range {p1 ..p2}, Ljava/lang/Math;->cos(D)D */
/* move-result-wide v2 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v4, v2 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* neg-double v8, v0 */
/* mul-double/2addr v6, v8 */
/* add-double/2addr v4, v6 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v6, v0 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v8, v2 */
/* add-double/2addr v6, v8 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v8, v2 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* neg-double v12, v0 */
/* mul-double/2addr v10, v12 */
/* add-double/2addr v8, v10 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v0, v10 */
/* iget-wide v10, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v2, v10 */
/* add-double/2addr v0, v2 */
/* iput-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iput-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iput-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
return;
} // .end method
public void rotate ( Double p0, Double p1, Double p2 ) {
/* .locals 1 */
/* invoke-static/range {p1 ..p6}, Lcom/wiyun/engine/types/WYAffineTransform;->makeRotate(DDD)Lcom/wiyun/engine/types/WYAffineTransform; */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).concat ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/types/WYAffineTransform;->concat(Lcom/wiyun/engine/types/WYAffineTransform;)Lcom/wiyun/engine/types/WYAffineTransform;
return;
} // .end method
public void scale ( Double p0, Double p1 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v0, p1 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v0, p3 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
return;
} // .end method
public void setToIdentity ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
return;
} // .end method
public void setToRotation ( Double p0 ) {
/* .locals 10 */
java.lang.Math .sin ( p1,p2 );
/* move-result-wide v4 */
java.lang.Math .cos ( p1,p2 );
/* move-result-wide v0 */
java.lang.Math .abs ( v0,v1 );
/* move-result-wide v2 */
/* const-wide v6, 0x3ddb7cdfd9d7bdbbL # 1.0E-10 */
/* cmpg-double v2, v2, v6 */
/* if-gez v2, :cond_1 */
/* const-wide/16 v2, 0x0 */
/* const-wide/16 v0, 0x0 */
/* cmpl-double v0, v4, v0 */
/* if-lez v0, :cond_0 */
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
} // :goto_0
/* move-wide v8, v2 */
/* move-wide v2, v0 */
/* move-wide v0, v8 */
} // :goto_1
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* neg-double v0, v2 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
return;
} // :cond_0
/* const-wide/high16 v0, -0x4010000000000000L # -1.0 */
} // :cond_1
java.lang.Math .abs ( v4,v5 );
/* move-result-wide v2 */
/* const-wide v6, 0x3ddb7cdfd9d7bdbbL # 1.0E-10 */
/* cmpg-double v2, v2, v6 */
/* if-gez v2, :cond_3 */
/* const-wide/16 v2, 0x0 */
/* const-wide/16 v4, 0x0 */
/* cmpl-double v0, v0, v4 */
/* if-lez v0, :cond_2 */
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
} // :cond_2
/* const-wide/high16 v0, -0x4010000000000000L # -1.0 */
} // :cond_3
/* move-wide v2, v4 */
} // .end method
public void setToRotation ( Double p0, Double p1, Double p2 ) {
/* .locals 6 */
/* const-wide/high16 v4, 0x3ff0000000000000L # 1.0 */
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).setToRotation ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/wiyun/engine/types/WYAffineTransform;->setToRotation(D)V
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* sub-double v0, v4, v0 */
/* mul-double/2addr v0, p3 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v2, p5 */
/* add-double/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* sub-double v0, v4, v0 */
/* mul-double/2addr v0, p5 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v2, p3 */
/* sub-double/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
return;
} // .end method
public void setToScale ( Double p0, Double p1 ) {
/* .locals 4 */
/* const-wide/high16 v2, 0x3ff0000000000000L # 1.0 */
/* iput-wide p1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iput-wide p3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* cmpl-double v0, p1, v2 */
/* if-nez v0, :cond_0 */
/* cmpl-double v0, p3, v2 */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // :goto_0
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // .end method
public void setToShear ( Double p0, Double p1 ) {
/* .locals 4 */
/* const-wide/16 v2, 0x0 */
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iput-wide p1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide p3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* cmpl-double v0, p1, v2 */
/* if-nez v0, :cond_0 */
/* cmpl-double v0, p3, v2 */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // :goto_0
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // .end method
public void setToTranslation ( Double p0, Double p1 ) {
/* .locals 4 */
/* const-wide/16 v2, 0x0 */
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide p1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iput-wide p3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* cmpl-double v0, p1, v2 */
/* if-nez v0, :cond_0 */
/* cmpl-double v0, p3, v2 */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // :goto_0
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
} // .end method
public void setTransform ( Double p0, Double p1, Double p2, Double p3, Double p4, Double p5 ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* iput-wide p1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iput-wide p3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iput-wide p5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iput-wide p7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iput-wide p9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iput-wide p11, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
return;
} // .end method
public void setTransform ( com.wiyun.engine.types.WYAffineTransform p0 ) {
/* .locals 13 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* iput v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->type:I */
/* iget-wide v1, p1, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* iget-wide v3, p1, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* iget-wide v5, p1, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* iget-wide v7, p1, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* iget-wide v9, p1, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iget-wide v11, p1, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* move-object v0, p0 */
/* invoke-virtual/range {v0 ..v12}, Lcom/wiyun/engine/types/WYAffineTransform;->setTransform(DDDDDD)V */
return;
} // .end method
public void shear ( Double p0, Double p1 ) {
/* .locals 1 */
com.wiyun.engine.types.WYAffineTransform .makeShear ( p1,p2,p3,p4 );
(( com.wiyun.engine.types.WYAffineTransform ) p0 ).concat ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/types/WYAffineTransform;->concat(Lcom/wiyun/engine/types/WYAffineTransform;)Lcom/wiyun/engine/types/WYAffineTransform;
return;
} // .end method
public void toGL ( Float[] p0 ) {
/* .locals 9 */
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
/* const/16 v0, 0xa */
/* const/16 v1, 0xf */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, p1, v1 */
/* aput v2, p1, v0 */
int v0 = 0; // const/4 v0, 0x0
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
int v0 = 4; // const/4 v0, 0x4
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
/* const/16 v0, 0xc */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
int v0 = 1; // const/4 v0, 0x1
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
int v0 = 5; // const/4 v0, 0x5
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
/* const/16 v0, 0xd */
/* iget-wide v1, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* double-to-float v1, v1 */
/* aput v1, p1, v0 */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "[["; // const-string v1, "[["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v2 = "], ["; // const-string v2, "], ["
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v2 = "]]"; // const-string v2, "]]"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public com.wiyun.engine.types.WYPoint transform ( Float p0, Float p1 ) {
/* .locals 7 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.types.WYPoint .make ( v0,v0 );
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
} // .end method
public com.wiyun.engine.types.WYPoint transform ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 8 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
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
/* float-to-double v2, v0 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v2, v4 */
/* float-to-double v0, v1 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v0, v4 */
/* add-double/2addr v0, v2 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iput v0, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
} // .end method
public void transform ( Double[] p0, Integer p1, Double[] p2, Integer p3, Integer p4 ) {
/* .locals 10 */
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, p3, :cond_0 */
/* if-ge p2, p4, :cond_0 */
/* mul-int/lit8 v1, p5, 0x2 */
/* add-int/2addr v1, p2 */
/* if-ge p4, v1, :cond_0 */
/* mul-int/lit8 v0, p5, 0x2 */
/* add-int/2addr v0, p2 */
/* add-int/lit8 p2, v0, -0x2 */
/* mul-int/lit8 v0, p5, 0x2 */
/* add-int/2addr v0, p4 */
/* add-int/lit8 p4, v0, -0x2 */
int v0 = -2; // const/4 v0, -0x2
} // :cond_0
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_1 */
return;
} // :cond_1
/* add-int/lit8 v1, p2, 0x0 */
/* aget-wide v1, p1, v1 */
/* add-int/lit8 v3, p2, 0x1 */
/* aget-wide v3, p1, v3 */
/* add-int/lit8 v5, p4, 0x0 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v6, v1 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v8, v3 */
/* add-double/2addr v6, v8 */
/* iget-wide v8, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v6, v8 */
/* aput-wide v6, p3, v5 */
/* add-int/lit8 v5, p4, 0x1 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v1, v6 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v3, v6 */
/* add-double/2addr v1, v3 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v1, v3 */
/* aput-wide v1, p3, v5 */
/* add-int/2addr p2, v0 */
/* add-int/2addr p4, v0 */
} // .end method
public void transform ( Double[] p0, Integer p1, Float[] p2, Integer p3, Integer p4 ) {
/* .locals 9 */
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_0 */
return;
} // :cond_0
/* add-int/lit8 v0, p2, 0x1 */
/* aget-wide v1, p1, p2 */
/* add-int/lit8 p2, v0, 0x1 */
/* aget-wide v3, p1, v0 */
/* add-int/lit8 v0, p4, 0x1 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v5, v1 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v7, v3 */
/* add-double/2addr v5, v7 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v5, v7 */
/* double-to-float v5, v5 */
/* aput v5, p3, p4 */
/* add-int/lit8 p4, v0, 0x1 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v1, v5 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v3, v5 */
/* add-double/2addr v1, v3 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v1, v3 */
/* double-to-float v1, v1 */
/* aput v1, p3, v0 */
} // .end method
public void transform ( Float[] p0, Integer p1, Double[] p2, Integer p3, Integer p4 ) {
/* .locals 9 */
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_0 */
return;
} // :cond_0
/* add-int/lit8 v0, p2, 0x1 */
/* aget v1, p1, p2 */
/* add-int/lit8 p2, v0, 0x1 */
/* aget v0, p1, v0 */
/* add-int/lit8 v2, p4, 0x1 */
/* float-to-double v3, v1 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v3, v5 */
/* float-to-double v5, v0 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v5, v7 */
/* add-double/2addr v3, v5 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v3, v5 */
/* aput-wide v3, p3, p4 */
/* add-int/lit8 p4, v2, 0x1 */
/* float-to-double v3, v1 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v3, v5 */
/* float-to-double v0, v0 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v0, v5 */
/* add-double/2addr v0, v3 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v0, v3 */
/* aput-wide v0, p3, v2 */
} // .end method
public void transform ( Float[] p0, Integer p1, Float[] p2, Integer p3, Integer p4 ) {
/* .locals 10 */
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, p3, :cond_0 */
/* if-ge p2, p4, :cond_0 */
/* mul-int/lit8 v1, p5, 0x2 */
/* add-int/2addr v1, p2 */
/* if-ge p4, v1, :cond_0 */
/* mul-int/lit8 v0, p5, 0x2 */
/* add-int/2addr v0, p2 */
/* add-int/lit8 p2, v0, -0x2 */
/* mul-int/lit8 v0, p5, 0x2 */
/* add-int/2addr v0, p4 */
/* add-int/lit8 p4, v0, -0x2 */
int v0 = -2; // const/4 v0, -0x2
} // :cond_0
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_1 */
return;
} // :cond_1
/* add-int/lit8 v1, p2, 0x0 */
/* aget v1, p1, v1 */
/* float-to-double v1, v1 */
/* add-int/lit8 v3, p2, 0x1 */
/* aget v3, p1, v3 */
/* float-to-double v3, v3 */
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
/* add-int/lit8 v5, p4, 0x1 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v1, v6 */
/* iget-wide v6, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v3, v6 */
/* add-double/2addr v1, v3 */
/* iget-wide v3, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v1, v3 */
/* double-to-float v1, v1 */
/* aput v1, p3, v5 */
/* add-int/2addr p2, v0 */
/* add-int/2addr p4, v0 */
} // .end method
public void transform ( com.wiyun.engine.types.WYPoint[] p0, Integer p1, com.wiyun.engine.types.WYPoint[] p2, Integer p3, Integer p4 ) {
/* .locals 11 */
} // :goto_0
/* add-int/lit8 p5, p5, -0x1 */
/* if-gez p5, :cond_0 */
return;
} // :cond_0
/* add-int/lit8 v2, p2, 0x1 */
/* aget-object v0, p1, p2 */
/* iget v1, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* float-to-double v3, v1 */
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* float-to-double v5, v0 */
/* aget-object v0, p3, p4 */
/* if-nez v0, :cond_1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
} // :cond_1
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v7, v3 */
/* iget-wide v9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v9, v5 */
/* add-double/2addr v7, v9 */
/* iget-wide v9, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v7, v9 */
/* double-to-float v1, v7 */
/* iput v1, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v3, v7 */
/* iget-wide v7, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v5, v7 */
/* add-double/2addr v3, v5 */
/* iget-wide v5, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v3, v5 */
/* double-to-float v1, v3 */
/* iput v1, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* add-int/lit8 v1, p4, 0x1 */
/* aput-object v0, p3, p4 */
/* move p4, v1 */
/* move p2, v2 */
} // .end method
public void translate ( Double p0, Double p1 ) {
/* .locals 6 */
/* iget-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->a:D */
/* mul-double/2addr v0, p1 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->c:D */
/* mul-double/2addr v2, p3 */
/* add-double/2addr v0, v2 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* add-double/2addr v0, v2 */
/* iget-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->b:D */
/* mul-double/2addr v2, p1 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->d:D */
/* mul-double/2addr v4, p3 */
/* add-double/2addr v2, v4 */
/* iget-wide v4, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
/* add-double/2addr v2, v4 */
/* iput-wide v0, p0, Lcom/wiyun/engine/types/WYAffineTransform;->tx:D */
/* iput-wide v2, p0, Lcom/wiyun/engine/types/WYAffineTransform;->ty:D */
return;
} // .end method

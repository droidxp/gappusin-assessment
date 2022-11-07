public class com.badlogic.gdx.utils.LongArray {
	 /* # instance fields */
	 public items;
	 public Boolean ordered;
	 public Integer size;
	 /* # direct methods */
	 public com.badlogic.gdx.utils.LongArray ( ) {
		 /* .locals 2 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* const/16 v1, 0x10 */
		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/utils/LongArray;-><init>(ZI)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.LongArray ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* invoke-direct {p0, v0, p1}, Lcom/badlogic/gdx/utils/LongArray;-><init>(ZI)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.LongArray ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iget-boolean v0, p1, Lcom/badlogic/gdx/utils/LongArray;->ordered:Z */
		 /* iput-boolean v0, p0, Lcom/badlogic/gdx/utils/LongArray;->ordered:Z */
		 /* iget v0, p1, Lcom/badlogic/gdx/utils/LongArray;->size:I */
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
		 /* iget v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
		 /* new-array v0, v0, [J */
		 this.items = v0;
		 v0 = this.items;
		 v1 = this.items;
		 /* iget v2, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
		 java.lang.System .arraycopy ( v0,v3,v1,v3,v2 );
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.LongArray ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean p1, p0, Lcom/badlogic/gdx/utils/LongArray;->ordered:Z */
		 /* new-array v0, p2, [J */
		 this.items = v0;
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.LongArray ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* array-length v0, p2 */
		 /* invoke-direct {p0, p1, v0}, Lcom/badlogic/gdx/utils/LongArray;-><init>(ZI)V */
		 /* array-length v0, p2 */
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
		 v0 = this.items;
		 /* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
		 java.lang.System .arraycopy ( p2,v2,v0,v2,v1 );
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.LongArray ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* invoke-direct {p0, v0, p1}, Lcom/badlogic/gdx/utils/LongArray;-><init>(Z[J)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void add ( Long p0 ) {
		 /* .locals 3 */
		 v0 = this.items;
		 /* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
		 /* array-length v2, v0 */
		 /* if-ne v1, v2, :cond_0 */
		 /* const/16 v0, 0x8 */
		 /* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x3fe00000 # 1.75f */
		 /* mul-float/2addr v1, v2 */
		 /* float-to-int v1, v1 */
		 v0 = 		 java.lang.Math .max ( v0,v1 );
		 (( com.badlogic.gdx.utils.LongArray ) p0 ).resize ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/LongArray;->resize(I)[J
	 } // :cond_0
	 /* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
	 /* add-int/lit8 v2, v1, 0x1 */
	 /* iput v2, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
	 /* aput-wide p1, v0, v1 */
	 return;
} // .end method
public void addAll ( com.badlogic.gdx.utils.LongArray p0 ) {
	 /* .locals 2 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iget v1, p1, Lcom/badlogic/gdx/utils/LongArray;->size:I */
	 (( com.badlogic.gdx.utils.LongArray ) p0 ).addAll ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/badlogic/gdx/utils/LongArray;->addAll(Lcom/badlogic/gdx/utils/LongArray;II)V
	 return;
} // .end method
public void addAll ( com.badlogic.gdx.utils.LongArray p0, Integer p1, Integer p2 ) {
	 /* .locals 3 */
	 /* add-int v0, p2, p3 */
	 /* iget v1, p1, Lcom/badlogic/gdx/utils/LongArray;->size:I */
	 /* if-le v0, v1, :cond_0 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "offset + length must be <= size: "; // const-string v2, "offset + length must be <= size: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v2 = " + "; // const-string v2, " + "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v2 = " <= "; // const-string v2, " <= "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v2, p1, Lcom/badlogic/gdx/utils/LongArray;->size:I */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
v0 = this.items;
(( com.badlogic.gdx.utils.LongArray ) p0 ).addAll ( v0, p2, p3 ); // invoke-virtual {p0, v0, p2, p3}, Lcom/badlogic/gdx/utils/LongArray;->addAll([JII)V
return;
} // .end method
public void addAll ( Long[] p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p1 */
(( com.badlogic.gdx.utils.LongArray ) p0 ).addAll ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/badlogic/gdx/utils/LongArray;->addAll([JII)V
return;
} // .end method
public void addAll ( Long[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* add-int/2addr v1, p3 */
/* sub-int/2addr v1, p2 */
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_0 */
/* const/16 v0, 0x8 */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x3fe00000 # 1.75f */
/* mul-float/2addr v1, v2 */
/* float-to-int v1, v1 */
v0 = java.lang.Math .max ( v0,v1 );
(( com.badlogic.gdx.utils.LongArray ) p0 ).resize ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/LongArray;->resize(I)[J
} // :cond_0
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
java.lang.System .arraycopy ( p1,p2,v0,v1,p3 );
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* add-int/2addr v0, p3 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
return;
} // .end method
public void clear ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
return;
} // .end method
public Boolean contains ( Long p0 ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* sub-int/2addr v0, v5 */
v1 = this.items;
} // :goto_0
/* if-ltz v0, :cond_0 */
/* add-int/lit8 v2, v0, -0x1 */
/* aget-wide v3, v1, v0 */
/* cmp-long v0, v3, p1 */
/* if-nez v0, :cond_1 */
/* move v0, v5 */
} // :goto_1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
/* move v0, v2 */
} // .end method
public ensureCapacity ( Integer p0 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* add-int/2addr v0, p1 */
v1 = this.items;
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_0 */
/* const/16 v1, 0x8 */
v0 = java.lang.Math .max ( v1,v0 );
(( com.badlogic.gdx.utils.LongArray ) p0 ).resize ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/LongArray;->resize(I)[J
} // :cond_0
v0 = this.items;
} // .end method
public Long get ( Integer p0 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* if-lt p1, v0, :cond_0 */
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = this.items;
/* aget-wide v0, v0, p1 */
/* return-wide v0 */
} // .end method
public Integer indexOf ( Long p0 ) {
/* .locals 5 */
v0 = this.items;
int v1 = 0; // const/4 v1, 0x0
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
} // :goto_0
/* if-ge v1, v2, :cond_1 */
/* aget-wide v3, v0, v1 */
/* cmp-long v3, v3, p1 */
/* if-nez v3, :cond_0 */
/* move v0, v1 */
} // :goto_1
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v0 = -1; // const/4 v0, -0x1
} // .end method
public void insert ( Integer p0, Long p1 ) {
/* .locals 4 */
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* array-length v2, v0 */
/* if-ne v1, v2, :cond_0 */
/* const/16 v0, 0x8 */
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x3fe00000 # 1.75f */
/* mul-float/2addr v1, v2 */
/* float-to-int v1, v1 */
v0 = java.lang.Math .max ( v0,v1 );
(( com.badlogic.gdx.utils.LongArray ) p0 ).resize ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/LongArray;->resize(I)[J
} // :cond_0
/* iget-boolean v1, p0, Lcom/badlogic/gdx/utils/LongArray;->ordered:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* add-int/lit8 v1, p1, 0x1 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* sub-int/2addr v2, p1 */
java.lang.System .arraycopy ( v0,p1,v0,v1,v2 );
} // :goto_0
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* aput-wide p2, v0, p1 */
return;
} // :cond_1
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* aget-wide v2, v0, p1 */
/* aput-wide v2, v0, v1 */
} // .end method
public Long peek ( ) {
/* .locals 3 */
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* aget-wide v0, v0, v1 */
/* return-wide v0 */
} // .end method
public Long pop ( ) {
/* .locals 3 */
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* iput v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* aget-wide v0, v0, v1 */
/* return-wide v0 */
} // .end method
public Long removeIndex ( Integer p0 ) {
/* .locals 5 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* if-lt p1, v0, :cond_0 */
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = this.items;
/* aget-wide v1, v0, p1 */
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
int v4 = 1; // const/4 v4, 0x1
/* sub-int/2addr v3, v4 */
/* iput v3, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* iget-boolean v3, p0, Lcom/badlogic/gdx/utils/LongArray;->ordered:Z */
if ( v3 != null) { // if-eqz v3, :cond_1
/* add-int/lit8 v3, p1, 0x1 */
/* iget v4, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* sub-int/2addr v4, p1 */
java.lang.System .arraycopy ( v0,v3,v0,p1,v4 );
} // :goto_0
/* return-wide v1 */
} // :cond_1
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* aget-wide v3, v0, v3 */
/* aput-wide v3, v0, p1 */
} // .end method
public Boolean removeValue ( Long p0 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* move v2, v5 */
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-wide v3, v0, v2 */
/* cmp-long v3, v3, p1 */
/* if-nez v3, :cond_0 */
(( com.badlogic.gdx.utils.LongArray ) p0 ).removeIndex ( v2 ); // invoke-virtual {p0, v2}, Lcom/badlogic/gdx/utils/LongArray;->removeIndex(I)J
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* move v0, v5 */
} // .end method
protected resize ( Integer p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
/* new-array v0, p1, [J */
v1 = this.items;
/* array-length v2, v1 */
/* array-length v3, v0 */
v2 = java.lang.Math .min ( v2,v3 );
java.lang.System .arraycopy ( v1,v4,v0,v4,v2 );
this.items = v0;
} // .end method
public void reverse ( ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* div-int/lit8 v2, v2, 0x2 */
} // :goto_0
/* if-ge v0, v2, :cond_0 */
/* sub-int v3, v1, v0 */
v4 = this.items;
/* aget-wide v4, v4, v0 */
v6 = this.items;
v7 = this.items;
/* aget-wide v7, v7, v3 */
/* aput-wide v7, v6, v0 */
v6 = this.items;
/* aput-wide v4, v6, v3 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void set ( Integer p0, Long p1 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* if-lt p1, v0, :cond_0 */
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = this.items;
/* aput-wide p2, v0, p1 */
return;
} // .end method
public void shrink ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
(( com.badlogic.gdx.utils.LongArray ) p0 ).resize ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/LongArray;->resize(I)[J
return;
} // .end method
public void shuffle ( ) {
/* .locals 7 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
v1 = com.badlogic.gdx.math.MathUtils .random ( v0 );
v2 = this.items;
/* aget-wide v2, v2, v0 */
v4 = this.items;
v5 = this.items;
/* aget-wide v5, v5, v1 */
/* aput-wide v5, v4, v0 */
v4 = this.items;
/* aput-wide v2, v4, v1 */
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
return;
} // .end method
public void sort ( ) {
/* .locals 3 */
v0 = this.items;
int v1 = 0; // const/4 v1, 0x0
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
java.util.Arrays .sort ( v0,v1,v2 );
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 5 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* if-nez v0, :cond_0 */
final String v0 = "[]"; // const-string v0, "[]"
} // :goto_0
} // :cond_0
v0 = this.items;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* const/16 v2, 0x20 */
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
/* const/16 v2, 0x5b */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
int v2 = 0; // const/4 v2, 0x0
/* aget-wide v2, v0, v2 */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
int v2 = 1; // const/4 v2, 0x1
} // :goto_1
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongArray;->size:I */
/* if-ge v2, v3, :cond_1 */
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* aget-wide v3, v0, v2 */
(( java.lang.StringBuilder ) v1 ).append ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* const/16 v0, 0x5d */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method

public class com.badlogic.gdx.utils.Array implements java.lang.Iterable {
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.Object items;
	 private com.badlogic.gdx.utils.Array$ArrayIterator iterator;
	 public Boolean ordered;
	 public Integer size;
	 /* # direct methods */
	 public com.badlogic.gdx.utils.Array ( ) {
		 /* .locals 2 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* const/16 v1, 0x10 */
		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/utils/Array;-><init>(ZI)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.Array ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* invoke-direct {p0, v0, p1}, Lcom/badlogic/gdx/utils/Array;-><init>(ZI)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.Array ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* iget-boolean v0, p1, Lcom/badlogic/gdx/utils/Array;->ordered:Z */
		 /* iget v1, p1, Lcom/badlogic/gdx/utils/Array;->size:I */
		 v2 = this.items;
		 (( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v2 ).getComponentType ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/utils/Array;-><init>(ZILjava/lang/Class;)V */
		 /* iget v0, p1, Lcom/badlogic/gdx/utils/Array;->size:I */
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
		 v0 = this.items;
		 v1 = this.items;
		 /* iget v2, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
		 java.lang.System .arraycopy ( v0,v3,v1,v3,v2 );
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.Array ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* const/16 v1, 0x10 */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/utils/Array;-><init>(ZILjava/lang/Class;)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.Array ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean p1, p0, Lcom/badlogic/gdx/utils/Array;->ordered:Z */
		 /* new-array v0, p2, [Ljava/lang/Object; */
		 /* check-cast v0, [Ljava/lang/Object; */
		 this.items = v0;
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.Array ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean p1, p0, Lcom/badlogic/gdx/utils/Array;->ordered:Z */
		 java.lang.reflect.Array .newInstance ( p3,p2 );
		 /* check-cast v0, [Ljava/lang/Object; */
		 this.items = v0;
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.Array ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* array-length v0, p2 */
		 (( java.lang.Object ) p2 ).getClass ( ); // invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v1 ).getComponentType ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
		 /* invoke-direct {p0, p1, v0, v1}, Lcom/badlogic/gdx/utils/Array;-><init>(ZILjava/lang/Class;)V */
		 /* array-length v0, p2 */
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
		 v0 = this.items;
		 /* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
		 java.lang.System .arraycopy ( p2,v2,v0,v2,v1 );
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.Array ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* invoke-direct {p0, v0, p1}, Lcom/badlogic/gdx/utils/Array;-><init>(Z[Ljava/lang/Object;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void add ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 v0 = this.items;
		 /* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
		 /* array-length v2, v0 */
		 /* if-ne v1, v2, :cond_0 */
		 /* const/16 v0, 0x8 */
		 /* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x3fe00000 # 1.75f */
		 /* mul-float/2addr v1, v2 */
		 /* float-to-int v1, v1 */
		 v0 = 		 java.lang.Math .max ( v0,v1 );
		 (( com.badlogic.gdx.utils.Array ) p0 ).resize ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/Array;->resize(I)[Ljava/lang/Object;
	 } // :cond_0
	 /* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
	 /* add-int/lit8 v2, v1, 0x1 */
	 /* iput v2, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
	 /* aput-object p1, v0, v1 */
	 return;
} // .end method
public void addAll ( com.badlogic.gdx.utils.Array p0 ) {
	 /* .locals 2 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iget v1, p1, Lcom/badlogic/gdx/utils/Array;->size:I */
	 (( com.badlogic.gdx.utils.Array ) p0 ).addAll ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/badlogic/gdx/utils/Array;->addAll(Lcom/badlogic/gdx/utils/Array;II)V
	 return;
} // .end method
public void addAll ( com.badlogic.gdx.utils.Array p0, Integer p1, Integer p2 ) {
	 /* .locals 3 */
	 /* add-int v0, p2, p3 */
	 /* iget v1, p1, Lcom/badlogic/gdx/utils/Array;->size:I */
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
	 /* iget v2, p1, Lcom/badlogic/gdx/utils/Array;->size:I */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
v0 = this.items;
/* check-cast v0, [Ljava/lang/Object; */
(( com.badlogic.gdx.utils.Array ) p0 ).addAll ( v0, p2, p3 ); // invoke-virtual {p0, v0, p2, p3}, Lcom/badlogic/gdx/utils/Array;->addAll([Ljava/lang/Object;II)V
return;
} // .end method
public void addAll ( java.lang.Object[] p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p1 */
(( com.badlogic.gdx.utils.Array ) p0 ).addAll ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/badlogic/gdx/utils/Array;->addAll([Ljava/lang/Object;II)V
return;
} // .end method
public void addAll ( java.lang.Object[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
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
(( com.badlogic.gdx.utils.Array ) p0 ).resize ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/Array;->resize(I)[Ljava/lang/Object;
} // :cond_0
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
java.lang.System .arraycopy ( p1,p2,v0,v1,p3 );
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* add-int/2addr v0, p3 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
return;
} // .end method
public void clear ( ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* move v2, v4 */
} // :goto_0
/* if-ge v2, v1, :cond_0 */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v3, v0, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
/* iput v4, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
return;
} // .end method
public Boolean contains ( java.lang.Object p0, Boolean p1 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* sub-int/2addr v1, v3 */
/* if-nez p2, :cond_0 */
/* if-nez p1, :cond_2 */
} // :cond_0
} // :goto_0
/* if-ltz v1, :cond_3 */
/* add-int/lit8 v2, v1, -0x1 */
/* aget-object v1, v0, v1 */
/* if-ne v1, p1, :cond_4 */
/* move v0, v3 */
} // :goto_1
} // :cond_1
/* move v1, v2 */
} // :cond_2
/* if-ltz v1, :cond_3 */
/* add-int/lit8 v2, v1, -0x1 */
/* aget-object v1, v0, v1 */
v1 = (( java.lang.Object ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* move v0, v3 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :cond_4
/* move v1, v2 */
} // .end method
public java.lang.Object ensureCapacity ( Integer p0 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* add-int/2addr v0, p1 */
v1 = this.items;
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_0 */
/* const/16 v1, 0x8 */
v0 = java.lang.Math .max ( v1,v0 );
(( com.badlogic.gdx.utils.Array ) p0 ).resize ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/Array;->resize(I)[Ljava/lang/Object;
} // :cond_0
v0 = this.items;
} // .end method
public java.lang.Object get ( Integer p0 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* if-lt p1, v0, :cond_0 */
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = this.items;
/* aget-object v0, v0, p1 */
} // .end method
public Integer indexOf ( java.lang.Object p0, Boolean p1 ) {
/* .locals 4 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.items;
/* if-nez p2, :cond_0 */
/* if-nez p1, :cond_2 */
} // :cond_0
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
} // :goto_0
/* if-ge v2, v1, :cond_4 */
/* aget-object v3, v0, v2 */
/* if-ne v3, p1, :cond_1 */
/* move v0, v2 */
} // :goto_1
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
} // :goto_2
/* if-ge v2, v1, :cond_4 */
/* aget-object v3, v0, v2 */
v3 = (( java.lang.Object ) p1 ).equals ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* move v0, v2 */
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
int v0 = -1; // const/4 v0, -0x1
} // .end method
public void insert ( Integer p0, java.lang.Object p1 ) {
/* .locals 3 */
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* array-length v2, v0 */
/* if-ne v1, v2, :cond_0 */
/* const/16 v0, 0x8 */
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x3fe00000 # 1.75f */
/* mul-float/2addr v1, v2 */
/* float-to-int v1, v1 */
v0 = java.lang.Math .max ( v0,v1 );
(( com.badlogic.gdx.utils.Array ) p0 ).resize ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/Array;->resize(I)[Ljava/lang/Object;
} // :cond_0
/* iget-boolean v1, p0, Lcom/badlogic/gdx/utils/Array;->ordered:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* add-int/lit8 v1, p1, 0x1 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* sub-int/2addr v2, p1 */
java.lang.System .arraycopy ( v0,p1,v0,v1,v2 );
} // :goto_0
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* aput-object p2, v0, p1 */
return;
} // :cond_1
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* aget-object v2, v0, p1 */
/* aput-object v2, v0, v1 */
} // .end method
public java.util.Iterator iterator ( ) {
/* .locals 2 */
v0 = this.iterator;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/badlogic/gdx/utils/Array$ArrayIterator; */
/* invoke-direct {v0, p0}, Lcom/badlogic/gdx/utils/Array$ArrayIterator;-><init>(Lcom/badlogic/gdx/utils/Array;)V */
this.iterator = v0;
} // :cond_0
v0 = this.iterator;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, v0, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->index:I */
v0 = this.iterator;
} // .end method
public java.lang.Object peek ( ) {
/* .locals 3 */
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* aget-object v0, v0, v1 */
} // .end method
public java.lang.Object pop ( ) {
/* .locals 4 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* aget-object v0, v0, v1 */
v1 = this.items;
/* iget v2, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v3, v1, v2 */
} // .end method
public java.lang.Object removeIndex ( Integer p0 ) {
/* .locals 4 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* if-lt p1, v0, :cond_0 */
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = this.items;
/* aget-object v1, v0, p1 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
/* iput v2, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* iget-boolean v2, p0, Lcom/badlogic/gdx/utils/Array;->ordered:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* add-int/lit8 v2, p1, 0x1 */
/* iget v3, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* sub-int/2addr v3, p1 */
java.lang.System .arraycopy ( v0,v2,v0,p1,v3 );
} // :goto_0
/* iget v2, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v3, v0, v2 */
} // :cond_1
/* iget v2, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* aget-object v2, v0, v2 */
/* aput-object v2, v0, p1 */
} // .end method
public Boolean removeValue ( java.lang.Object p0, Boolean p1 ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
v0 = this.items;
/* if-nez p2, :cond_0 */
/* if-nez p1, :cond_2 */
} // :cond_0
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* move v2, v4 */
} // :goto_0
/* if-ge v2, v1, :cond_4 */
/* aget-object v3, v0, v2 */
/* if-ne v3, p1, :cond_1 */
(( com.badlogic.gdx.utils.Array ) p0 ).removeIndex ( v2 ); // invoke-virtual {p0, v2}, Lcom/badlogic/gdx/utils/Array;->removeIndex(I)Ljava/lang/Object;
/* move v0, v5 */
} // :goto_1
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* move v2, v4 */
} // :goto_2
/* if-ge v2, v1, :cond_4 */
/* aget-object v3, v0, v2 */
v3 = (( java.lang.Object ) p1 ).equals ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
(( com.badlogic.gdx.utils.Array ) p0 ).removeIndex ( v2 ); // invoke-virtual {p0, v2}, Lcom/badlogic/gdx/utils/Array;->removeIndex(I)Ljava/lang/Object;
/* move v0, v5 */
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
/* move v0, v4 */
} // .end method
protected java.lang.Object resize ( Integer p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
v1 = this.items;
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getComponentType ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
java.lang.reflect.Array .newInstance ( v0,p1 );
/* check-cast v0, [Ljava/lang/Object; */
/* array-length v2, v1 */
/* array-length v3, v0 */
v2 = java.lang.Math .min ( v2,v3 );
java.lang.System .arraycopy ( v1,v4,v0,v4,v2 );
this.items = v0;
} // .end method
public void reverse ( ) {
/* .locals 7 */
int v0 = 0; // const/4 v0, 0x0
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* div-int/lit8 v2, v2, 0x2 */
} // :goto_0
/* if-ge v0, v2, :cond_0 */
/* sub-int v3, v1, v0 */
v4 = this.items;
/* aget-object v4, v4, v0 */
v5 = this.items;
v6 = this.items;
/* aget-object v6, v6, v3 */
/* aput-object v6, v5, v0 */
v5 = this.items;
/* aput-object v4, v5, v3 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void set ( Integer p0, java.lang.Object p1 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* if-lt p1, v0, :cond_0 */
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = this.items;
/* aput-object p2, v0, p1 */
return;
} // .end method
public void shrink ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
(( com.badlogic.gdx.utils.Array ) p0 ).resize ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/Array;->resize(I)[Ljava/lang/Object;
return;
} // .end method
public void shuffle ( ) {
/* .locals 5 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
v1 = com.badlogic.gdx.math.MathUtils .random ( v0 );
v2 = this.items;
/* aget-object v2, v2, v0 */
v3 = this.items;
v4 = this.items;
/* aget-object v4, v4, v1 */
/* aput-object v4, v3, v0 */
v3 = this.items;
/* aput-object v2, v3, v1 */
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
return;
} // .end method
public void sort ( ) {
/* .locals 4 */
com.badlogic.gdx.utils.Sort .instance ( );
v1 = this.items;
int v2 = 0; // const/4 v2, 0x0
/* iget v3, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
(( com.badlogic.gdx.utils.Sort ) v0 ).sort ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/utils/Sort;->sort([Ljava/lang/Object;II)V
return;
} // .end method
public void sort ( java.util.Comparator p0 ) {
/* .locals 4 */
com.badlogic.gdx.utils.Sort .instance ( );
v1 = this.items;
int v2 = 0; // const/4 v2, 0x0
/* iget v3, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
(( com.badlogic.gdx.utils.Sort ) v0 ).sort ( v1, p1, v2, v3 ); // invoke-virtual {v0, v1, p1, v2, v3}, Lcom/badlogic/gdx/utils/Sort;->sort([Ljava/lang/Object;Ljava/util/Comparator;II)V
return;
} // .end method
public java.lang.Object toArray ( ) {
/* .locals 1 */
v0 = this.items;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getComponentType ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
(( com.badlogic.gdx.utils.Array ) p0 ).toArray ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/utils/Array;->toArray(Ljava/lang/Class;)[Ljava/lang/Object;
/* check-cast p0, [Ljava/lang/Object; */
} // .end method
public java.lang.Object toArray ( java.lang.Class p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
java.lang.reflect.Array .newInstance ( p1,v0 );
/* check-cast v0, [Ljava/lang/Object; */
v1 = this.items;
/* iget v2, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
java.lang.System .arraycopy ( v1,v3,v0,v3,v2 );
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
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
/* aget-object v2, v0, v2 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
int v2 = 1; // const/4 v2, 0x1
} // :goto_1
/* iget v3, p0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* if-ge v2, v3, :cond_1 */
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* aget-object v3, v0, v2 */
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* const/16 v0, 0x5d */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method

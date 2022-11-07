public class com.a.d.b {
	 /* # instance fields */
	 private Integer a;
	 private Integer b;
	 private Integer c;
	 /* # direct methods */
	 public com.a.d.b ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 v0 = 		 (( com.a.d.b ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/a/d/b;->d()I
		 /* iput v0, p0, Lcom/a/d/b;->c:I */
		 return;
	 } // .end method
	 public com.a.d.b ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/a/d/b;->b:I */
		 v0 = 		 (( com.a.d.b ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/a/d/b;->d()I
		 /* iput v0, p0, Lcom/a/d/b;->a:I */
		 v0 = 		 (( com.a.d.b ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/a/d/b;->d()I
		 /* iput v0, p0, Lcom/a/d/b;->c:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 3 */
		 v0 = 		 (( com.a.d.b ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/a/d/b;->d()I
		 /* iget v1, p0, Lcom/a/d/b;->a:I */
		 /* sub-int v1, v0, v1 */
		 /* if-lez v1, :cond_1 */
		 /* iget v1, p0, Lcom/a/d/b;->b:I */
		 /* iget v2, p0, Lcom/a/d/b;->a:I */
		 /* sub-int v2, v0, v2 */
		 /* sub-int/2addr v1, v2 */
		 /* iput v1, p0, Lcom/a/d/b;->b:I */
		 /* iput v0, p0, Lcom/a/d/b;->a:I */
		 /* iget v0, p0, Lcom/a/d/b;->b:I */
		 /* if-gez v0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/a/d/b;->b:I */
	 } // :cond_0
} // :goto_0
/* iget v0, p0, Lcom/a/d/b;->b:I */
} // :cond_1
v0 = (( com.a.d.b ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/a/d/b;->d()I
/* iput v0, p0, Lcom/a/d/b;->a:I */
} // .end method
public Integer b ( ) {
/* .locals 2 */
v0 = (( com.a.d.b ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/a/d/b;->d()I
/* iget v1, p0, Lcom/a/d/b;->c:I */
/* sub-int/2addr v0, v1 */
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/a/d/b;->b:I */
/* if-gtz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer d ( ) {
/* .locals 4 */
java.util.Calendar .getInstance ( );
/* const/16 v1, 0xa */
v1 = (( java.util.Calendar ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I
/* const/16 v2, 0xc */
v2 = (( java.util.Calendar ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I
/* const/16 v3, 0xd */
v0 = (( java.util.Calendar ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I
/* mul-int/lit8 v2, v2, 0x3c */
/* add-int/2addr v0, v2 */
/* mul-int/lit16 v1, v1, 0xe10 */
/* add-int/2addr v0, v1 */
} // .end method

public class inal implements com.doodlemobile.basket.graphics.i {
	 /* # interfaces */
	 /* # instance fields */
	 private Integer a;
	 private Integer b;
	 private Long c;
	 private Integer d;
	 private Integer e;
	 private com.doodlemobile.basket.graphics.DTileAnimation f; //synthetic
	 /* # direct methods */
	 protected inal ( ) {
		 /* .locals 3 */
		 int v2 = -1; // const/4 v2, -0x1
		 this.f = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v2, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
		 /* const/16 v0, 0x3e8 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->d:I */
		 /* iput v2, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
		 return;
	 } // .end method
	 private void b ( Integer p0 ) {
		 /* .locals 2 */
		 /* iput p1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
		 /* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
		 /* if-ltz v0, :cond_0 */
		 v0 = this.f;
		 v0 = this.i;
		 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
		 /* aget-object v0, v0, v1 */
		 /* array-length v0, v0 */
		 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
		 /* if-le v0, v1, :cond_0 */
		 v0 = this.f;
		 v0 = this.i;
		 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
		 /* aget-object v0, v0, v1 */
		 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
		 /* aget v0, v0, v1 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
	 } // :goto_0
	 return;
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
} // .end method
/* # virtual methods */
public final Integer a ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
} // .end method
public final void a ( Integer p0 ) {
/* .locals 3 */
int v2 = -1; // const/4 v2, -0x1
/* if-eq p1, v2, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = this.f;
v1 = this.h;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_1 */
v1 = this.f;
v1 = this.h;
/* aget v1, v1, v0 */
/* if-ne p1, v1, :cond_0 */
/* invoke-direct {p0, v0}, Lcom/doodlemobile/basket/graphics/g;->b(I)V */
} // :goto_1
return;
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* invoke-direct {p0, v2}, Lcom/doodlemobile/basket/graphics/g;->b(I)V */
} // .end method
public final void a ( Long p0 ) {
/* .locals 7 */
int v6 = -1; // const/4 v6, -0x1
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* if-ltz v0, :cond_2 */
v0 = this.f;
v0 = this.j;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v0, v0, v1 */
/* array-length v0, v0 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* if-le v0, v1, :cond_2 */
v0 = this.f;
v0 = this.j;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* aget v0, v0, v1 */
/* if-lez v0, :cond_2 */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
/* iget v2, p0, Lcom/doodlemobile/basket/graphics/g;->d:I */
/* int-to-long v2, v2 */
/* mul-long/2addr v2, p1 */
/* const-wide/16 v4, 0x3e8 */
/* div-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* if-ltz v0, :cond_2 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* if-ltz v0, :cond_2 */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
v2 = this.f;
v2 = this.j;
/* iget v3, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v2, v2, v3 */
/* iget v3, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* aget v2, v2, v3 */
/* int-to-long v2, v2 */
/* cmp-long v0, v0, v2 */
/* if-ltz v0, :cond_2 */
v0 = this.f;
v0 = this.j;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* aget v0, v0, v1 */
/* if-lez v0, :cond_2 */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
v2 = this.f;
v2 = this.j;
/* iget v3, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v2, v2, v3 */
/* iget v3, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* aget v2, v2, v3 */
/* int-to-long v2, v2 */
/* sub-long/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
v1 = this.f;
v1 = this.i;
/* iget v2, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v1, v1, v2 */
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_1 */
v0 = this.f;
v0 = this.k;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget v0, v0, v1 */
/* invoke-direct {p0, v0}, Lcom/doodlemobile/basket/graphics/g;->b(I)V */
} // :cond_1
/* sget-boolean v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_2
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* if-ltz v0, :cond_4 */
v0 = this.f;
v0 = this.i;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v0, v0, v1 */
/* array-length v0, v0 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* if-le v0, v1, :cond_4 */
v0 = this.f;
v0 = this.i;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* aget v0, v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
} // :goto_0
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
v1 = this.f;
/* iget v1, v1, Lcom/doodlemobile/basket/graphics/DTileAnimation;->d:I */
v2 = this.f;
/* iget v2, v2, Lcom/doodlemobile/basket/graphics/DTileAnimation;->e:I */
/* mul-int/2addr v1, v2 */
/* if-le v0, v1, :cond_3 */
/* iput v6, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
} // :cond_3
return;
} // :cond_4
/* iput v6, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
} // .end method
public final Integer b ( ) {
/* .locals 2 */
int v1 = -1; // const/4 v1, -0x1
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* if-ne v0, v1, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
v0 = this.f;
v0 = this.h;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget v0, v0, v1 */
} // .end method

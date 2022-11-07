public class com.doodlemobile.basket.util.d {
	 /* # instance fields */
	 protected Integer a;
	 protected Integer b;
	 protected Long c;
	 protected Long d;
	 protected Long e;
	 private Long f;
	 private Long g;
	 private Boolean h;
	 private Long i;
	 private Integer j;
	 private Long k;
	 /* # direct methods */
	 public com.doodlemobile.basket.util.d ( ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* const-wide/16 v2, 0x0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/util/d;->f:J */
		 /* iput-boolean v4, p0, Lcom/doodlemobile/basket/util/d;->h:Z */
		 /* iput v4, p0, Lcom/doodlemobile/basket/util/d;->a:I */
		 /* iput-wide v2, p0, Lcom/doodlemobile/basket/util/d;->i:J */
		 /* iput-wide v2, p0, Lcom/doodlemobile/basket/util/d;->k:J */
		 /* iput-wide v2, p0, Lcom/doodlemobile/basket/util/d;->c:J */
		 /* const-wide/32 v0, 0x186a0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/util/d;->d:J */
		 /* iput-wide v2, p0, Lcom/doodlemobile/basket/util/d;->e:J */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public final Long b ( ) {
		 /* .locals 8 */
		 /* const-wide/16 v6, 0x3e8 */
		 /* const-wide/16 v4, 0x0 */
		 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/util/d;->h:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iput-wide v4, p0, Lcom/doodlemobile/basket/util/d;->k:J */
			 /* move-wide v0, v4 */
		 } // :goto_0
		 /* return-wide v0 */
	 } // :cond_0
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v0 */
	 /* iget-wide v2, p0, Lcom/doodlemobile/basket/util/d;->f:J */
	 /* sub-long v2, v0, v2 */
	 /* iput-wide v0, p0, Lcom/doodlemobile/basket/util/d;->f:J */
	 /* iget-wide v0, p0, Lcom/doodlemobile/basket/util/d;->i:J */
	 /* add-long/2addr v0, v2 */
	 /* iput-wide v0, p0, Lcom/doodlemobile/basket/util/d;->i:J */
	 /* iget v0, p0, Lcom/doodlemobile/basket/util/d;->a:I */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/util/d;->a:I */
	 /* iget-wide v0, p0, Lcom/doodlemobile/basket/util/d;->i:J */
	 /* cmp-long v0, v0, v6 */
	 /* if-ltz v0, :cond_1 */
	 /* iget-wide v0, p0, Lcom/doodlemobile/basket/util/d;->i:J */
	 /* sub-long/2addr v0, v6 */
	 /* iput-wide v0, p0, Lcom/doodlemobile/basket/util/d;->i:J */
	 /* iget v0, p0, Lcom/doodlemobile/basket/util/d;->a:I */
	 /* iput v0, p0, Lcom/doodlemobile/basket/util/d;->b:I */
	 /* iget v0, p0, Lcom/doodlemobile/basket/util/d;->j:I */
	 /* iget v1, p0, Lcom/doodlemobile/basket/util/d;->b:I */
	 /* add-int/2addr v0, v1 */
	 /* div-int/lit8 v0, v0, 0x2 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/util/d;->j:I */
	 (( com.doodlemobile.basket.util.d ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/util/d;->a()V
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput v0, p0, Lcom/doodlemobile/basket/util/d;->a:I */
	 /* iput-wide v4, p0, Lcom/doodlemobile/basket/util/d;->c:J */
	 /* const-wide/32 v0, 0x186a0 */
	 /* iput-wide v0, p0, Lcom/doodlemobile/basket/util/d;->d:J */
	 /* iput-wide v4, p0, Lcom/doodlemobile/basket/util/d;->e:J */
} // :cond_1
/* iput-wide v2, p0, Lcom/doodlemobile/basket/util/d;->k:J */
/* move-wide v0, v2 */
} // .end method
public final Long c ( ) {
/* .locals 4 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/doodlemobile/basket/util/d;->f:J */
/* sub-long/2addr v0, v2 */
/* iget-wide v2, p0, Lcom/doodlemobile/basket/util/d;->d:J */
java.lang.Math .min ( v2,v3,v0,v1 );
/* move-result-wide v2 */
/* iput-wide v2, p0, Lcom/doodlemobile/basket/util/d;->d:J */
/* iget-wide v2, p0, Lcom/doodlemobile/basket/util/d;->c:J */
java.lang.Math .max ( v2,v3,v0,v1 );
/* move-result-wide v2 */
/* iput-wide v2, p0, Lcom/doodlemobile/basket/util/d;->c:J */
/* iget-wide v2, p0, Lcom/doodlemobile/basket/util/d;->e:J */
/* add-long/2addr v2, v0 */
/* iput-wide v2, p0, Lcom/doodlemobile/basket/util/d;->e:J */
/* return-wide v0 */
} // .end method
public final void d ( ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/util/d;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/util/d;->h:Z */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/util/d;->g:J */
} // .end method
public final void e ( ) {
/* .locals 6 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/util/d;->h:Z */
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/util/d;->h:Z */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/util/d;->f:J */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* iget-wide v4, p0, Lcom/doodlemobile/basket/util/d;->g:J */
/* sub-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/util/d;->f:J */
} // .end method

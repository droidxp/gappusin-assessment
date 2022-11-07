public class com.ansca.corona.TimeSpan implements java.lang.Comparable {
	 /* .source "TimeSpan.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private Long fMilliseconds;
	 /* # direct methods */
	 public com.ansca.corona.TimeSpan ( ) {
		 /* .locals 4 */
		 /* .param p1, "days" # J */
		 /* .param p3, "hours" # J */
		 /* .param p5, "minutes" # J */
		 /* .param p7, "seconds" # J */
		 /* .param p9, "milliseconds" # J */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 24 */
		 /* iput-wide p9, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
		 /* .line 25 */
		 /* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
		 /* const-wide/16 v2, 0x3e8 */
		 /* mul-long/2addr v2, p7 */
		 /* add-long/2addr v0, v2 */
		 /* iput-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
		 /* .line 26 */
		 /* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
		 /* const-wide/32 v2, 0xea60 */
		 /* mul-long/2addr v2, p5 */
		 /* add-long/2addr v0, v2 */
		 /* iput-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
		 /* .line 27 */
		 /* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
		 /* const-wide/32 v2, 0x36ee80 */
		 /* mul-long/2addr v2, p3 */
		 /* add-long/2addr v0, v2 */
		 /* iput-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
		 /* .line 28 */
		 /* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
		 /* const-wide/32 v2, 0x5265c00 */
		 /* mul-long/2addr v2, p1 */
		 /* add-long/2addr v0, v2 */
		 /* iput-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
		 /* .line 29 */
		 return;
	 } // .end method
	 public static com.ansca.corona.TimeSpan fromMilliseconds ( Long p0 ) {
		 /* .locals 11 */
		 /* .param p0, "value" # J */
		 /* .prologue */
		 /* const-wide/16 v1, 0x0 */
		 /* .line 194 */
		 /* new-instance v0, Lcom/ansca/corona/TimeSpan; */
		 /* move-wide v3, v1 */
		 /* move-wide v5, v1 */
		 /* move-wide v7, v1 */
		 /* move-wide v9, p0 */
		 /* invoke-direct/range {v0 ..v10}, Lcom/ansca/corona/TimeSpan;-><init>(JJJJJ)V */
	 } // .end method
	 public static com.ansca.corona.TimeSpan fromMinutes ( Long p0 ) {
		 /* .locals 11 */
		 /* .param p0, "value" # J */
		 /* .prologue */
		 /* const-wide/16 v1, 0x0 */
		 /* .line 212 */
		 /* new-instance v0, Lcom/ansca/corona/TimeSpan; */
		 /* move-wide v3, v1 */
		 /* move-wide v5, p0 */
		 /* move-wide v7, v1 */
		 /* move-wide v9, v1 */
		 /* invoke-direct/range {v0 ..v10}, Lcom/ansca/corona/TimeSpan;-><init>(JJJJJ)V */
	 } // .end method
	 public static com.ansca.corona.TimeSpan fromSeconds ( Long p0 ) {
		 /* .locals 11 */
		 /* .param p0, "value" # J */
		 /* .prologue */
		 /* const-wide/16 v1, 0x0 */
		 /* .line 203 */
		 /* new-instance v0, Lcom/ansca/corona/TimeSpan; */
		 /* move-wide v3, v1 */
		 /* move-wide v5, v1 */
		 /* move-wide v7, p0 */
		 /* move-wide v9, v1 */
		 /* invoke-direct/range {v0 ..v10}, Lcom/ansca/corona/TimeSpan;-><init>(JJJJJ)V */
	 } // .end method
	 /* # virtual methods */
	 public Integer compareTo ( com.ansca.corona.TimeSpan p0 ) {
		 /* .locals 9 */
		 /* .param p1, "value" # Lcom/ansca/corona/TimeSpan; */
		 /* .prologue */
		 /* const-wide/16 v7, 0x0 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* .line 146 */
		 /* if-nez p1, :cond_1 */
		 /* .line 158 */
	 } // :cond_0
} // :goto_0
/* .line 151 */
} // :cond_1
/* iget-wide v3, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* iget-wide v5, p1, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* sub-long v0, v3, v5 */
/* .line 152 */
/* .local v0, "result":J */
/* cmp-long v3, v0, v7 */
/* if-gez v3, :cond_2 */
/* .line 153 */
int v2 = -1; // const/4 v2, -0x1
/* .line 155 */
} // :cond_2
/* cmp-long v3, v0, v7 */
/* if-nez v3, :cond_0 */
/* .line 156 */
int v2 = 0; // const/4 v2, 0x0
} // .end method
public Integer compareTo ( java.lang.Object p0 ) {
/* .locals 1 */
/* .param p1, "value" # Ljava/lang/Object; */
/* .prologue */
/* .line 171 */
/* instance-of v0, p1, Lcom/ansca/corona/TimeSpan; */
/* if-nez v0, :cond_0 */
/* .line 172 */
int v0 = 1; // const/4 v0, 0x1
/* .line 176 */
} // .end local p1 # "value":Ljava/lang/Object;
} // :goto_0
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_0
/* check-cast p1, Lcom/ansca/corona/TimeSpan; */
} // .end local p1 # "value":Ljava/lang/Object;
v0 = (( com.ansca.corona.TimeSpan ) p0 ).compareTo ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/TimeSpan;->compareTo(Lcom/ansca/corona/TimeSpan;)I
} // .end method
public Boolean equals ( com.ansca.corona.TimeSpan p0 ) {
/* .locals 5 */
/* .param p1, "value" # Lcom/ansca/corona/TimeSpan; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 117 */
/* if-nez p1, :cond_1 */
/* .line 120 */
} // :cond_0
} // :goto_0
} // :cond_1
/* iget-wide v1, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* iget-wide v3, p1, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* cmp-long v1, v1, v3 */
/* if-nez v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .param p1, "value" # Ljava/lang/Object; */
/* .prologue */
/* .line 131 */
/* instance-of v0, p1, Lcom/ansca/corona/TimeSpan; */
/* if-nez v0, :cond_0 */
/* .line 132 */
int v0 = 0; // const/4 v0, 0x0
/* .line 134 */
} // .end local p1 # "value":Ljava/lang/Object;
} // :goto_0
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_0
/* check-cast p1, Lcom/ansca/corona/TimeSpan; */
} // .end local p1 # "value":Ljava/lang/Object;
v0 = (( com.ansca.corona.TimeSpan ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/TimeSpan;->equals(Lcom/ansca/corona/TimeSpan;)Z
} // .end method
public Integer getDays ( ) {
/* .locals 4 */
/* .prologue */
/* .line 36 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* const-wide/32 v2, 0x5265c00 */
/* div-long/2addr v0, v2 */
/* long-to-int v0, v0 */
} // .end method
public Integer getHours ( ) {
/* .locals 4 */
/* .prologue */
/* .line 44 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* const-wide/32 v2, 0x36ee80 */
/* div-long/2addr v0, v2 */
/* long-to-int v0, v0 */
/* rem-int/lit8 v0, v0, 0x18 */
} // .end method
public Integer getMilliseconds ( ) {
/* .locals 4 */
/* .prologue */
/* .line 68 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* const-wide/16 v2, 0x3e8 */
/* rem-long/2addr v0, v2 */
/* long-to-int v0, v0 */
} // .end method
public Integer getMinutes ( ) {
/* .locals 4 */
/* .prologue */
/* .line 52 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* const-wide/32 v2, 0xea60 */
/* div-long/2addr v0, v2 */
/* long-to-int v0, v0 */
/* rem-int/lit8 v0, v0, 0x3c */
} // .end method
public Integer getSeconds ( ) {
/* .locals 4 */
/* .prologue */
/* .line 60 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* const-wide/16 v2, 0x3e8 */
/* div-long/2addr v0, v2 */
/* long-to-int v0, v0 */
/* rem-int/lit8 v0, v0, 0x3c */
} // .end method
public Double getTotalDays ( ) {
/* .locals 4 */
/* .prologue */
/* .line 76 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* long-to-double v0, v0 */
/* const-wide v2, 0x4194997000000000L # 8.64E7 */
/* div-double/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public Double getTotalHours ( ) {
/* .locals 4 */
/* .prologue */
/* .line 84 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* long-to-double v0, v0 */
/* const-wide v2, 0x414b774000000000L # 3600000.0 */
/* div-double/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public Long getTotalMilliseconds ( ) {
/* .locals 2 */
/* .prologue */
/* .line 108 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* return-wide v0 */
} // .end method
public Double getTotalMinutes ( ) {
/* .locals 4 */
/* .prologue */
/* .line 92 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* long-to-double v0, v0 */
/* const-wide v2, 0x40ed4c0000000000L # 60000.0 */
/* div-double/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public Double getTotalSeconds ( ) {
/* .locals 4 */
/* .prologue */
/* .line 100 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* long-to-double v0, v0 */
/* const-wide v2, 0x408f400000000000L # 1000.0 */
/* div-double/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .prologue */
/* .line 185 */
/* iget-wide v0, p0, Lcom/ansca/corona/TimeSpan;->fMilliseconds:J */
/* long-to-int v0, v0 */
} // .end method

package com.example.superapp.models

data class Publisher(val id: Int,val name:String,val image:String){
    companion object{
        val publishers = mutableListOf<Publisher>(
            Publisher(1,"Marvel","https://cdn.icon-icons.com/icons2/2845/PNG/512/marvel_logo_icon_181411.png"),
            Publisher(2,"DCComics","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/f359881d-6bb2-4391-aba6-779f7084edd4/dafn02k-5c569883-c9b9-4a24-b669-020dce9083d3.png/v1/fill/w_1024,h_1024/justice_league_logo___transparent_by_asthonx1_dafn02k-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTAyNCIsInBhdGgiOiJcL2ZcL2YzNTk4ODFkLTZiYjItNDM5MS1hYmE2LTc3OWY3MDg0ZWRkNFwvZGFmbjAyay01YzU2OTg4My1jOWI5LTRhMjQtYjY2OS0wMjBkY2U5MDgzZDMucG5nIiwid2lkdGgiOiI8PTEwMjQifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.GEy1Cz0trwP1UpDwScW4rGgpvtpbwORYxr1MeIOcCFc"),
        )
    }
}

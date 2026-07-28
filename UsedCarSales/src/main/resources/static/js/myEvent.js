$(document).ready(function() {
    
    // HTMLのボタン(#btn-error)に「クリックイベント」を付与する
    $('#btn-error').on('click', function() {
        
        // あえて存在しないURLへAjax通信を飛ばす
        $.ajax({
            type: "GET",
            url: "/not-exist-url", // 存在しないURL
            dataType: "text"
        })
        .done(function(data) {
            // 成功した場合はここ（今回は存在しないURLなので通らない）
            alert("成功しました");
        })
        .fail(function(jqXHR, textStatus, errorThrown) {
            // 通信に失敗した場合にここが動く！
            alert("通信に失敗しました");
        });

    });

});
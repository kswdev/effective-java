package effective.study.chapter04.item;

import effective.study.chapter04.Day;
import effective.study.chapter04.member.MemberService;

public class ItemService {
    private MemberService memberService;

    boolean onSale;

    protected int saleRate;

    public ItemService(MemberService memberService) {
        if(memberService == null) {
            throw new IllegalArgumentException("MemberService should not be null.");
        }

        this.memberService = memberService;
    }

    MemberService getMemberService() {
        return memberService;
    }
}

package hello.core.member;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member findMember(Long memberId) {
        // TODO Auto-generated method stub
        return memberRepository.findByID(memberId);
    }
    @Override
    public void join(Member member) {
        // TODO Auto-generated method stub
        memberRepository.save(member);
    }
}
